package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.business.requests.LanguageRequest;
import kodlama.io.devs.business.responses.LanguageResponse;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;
import kodlama.io.devs.mapper.LanguageMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;
    private LanguageMapper languageMapper;


    public LanguageManager(LanguageRepository languageRepository, LanguageMapper languageMapper) {
        this.languageRepository = languageRepository;
        this.languageMapper = languageMapper;
    }

    @Override
    public List<LanguageResponse> getall() {
        return getAllLanguagesResponse(languageRepository.findAll());
    }

    @Override
    public LanguageResponse add(LanguageRequest languageRequest) {
        isNameExist(languageRequest.getName());
        Language language = languageMapper.convertLanguageRequest2Language(languageRequest);
        return languageMapper.convertLanguage2LanguageResponse(languageRepository.saveAndFlush(language));

    }

    @Override
    public void delete(LanguageRequest languageRequest) {
        Language language = languageMapper.convertLanguageRequest2Language(languageRequest);
        languageRepository.delete(language);
    }

    @Override
    public LanguageResponse update(LanguageRequest languageRequest) {
        isNameExist(languageRequest.getName());
        Language language = languageMapper.convertLanguageRequest2Language(languageRequest);
        return languageMapper.convertLanguage2LanguageResponse(languageRepository.saveAndFlush(language));

    }

    @Override
    public LanguageResponse getById(int id) {
        Language language = languageRepository.findById(id).orElseThrow(() -> new RuntimeException(String.format("There is no Language with id %s\n", id)));
        return languageMapper.convertLanguage2LanguageResponse(language);
    }
    private List<LanguageResponse> getAllLanguagesResponse(List<Language> languages){
        List<LanguageResponse> languageResponses = new ArrayList<>();
        for(Language language: languages){
            languageResponses.add(languageMapper.convertLanguage2LanguageResponse(language));
        }
        return languageResponses;
    }

    private void isNameExist(String name){
        if(languageRepository.findByName(name).isPresent()){
            throw new RuntimeException(String.format("There is Language with name %s \n", name));
        }
    }
}
