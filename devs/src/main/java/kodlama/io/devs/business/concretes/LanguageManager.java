package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;


    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getall() {
        return languageRepository.getAll();
    }

    @Override
    public List<Language> add(Language language) {
        if(kayitUygunMu(language)){
            return languageRepository.add(language);
        }
        return null;
    }

    @Override
    public List<Language> delete(int id) {
        return languageRepository.delete(id);
    }

    @Override
    public List<Language> update(Language language) {
        if(kayitUygunMu(language)){
            return languageRepository.update(language);
        }
        return null;
    }

    @Override
    public Language getById(int id) {
        return languageRepository.getById(id);
    }

    private boolean kayitUygunMu(Language language){

        if(language.getName() == null){
            return false;
        }
        List<Language> languages = languageRepository.getAll();
        for(Language lan : languages){
            if(lan.getName().equalsIgnoreCase(language.getName())){
                return false;
            }
        }
        return true;
    }
}
