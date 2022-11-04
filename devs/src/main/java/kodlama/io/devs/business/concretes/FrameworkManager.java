package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.FrameworkService;
import kodlama.io.devs.business.requests.FrameworkRequest;
import kodlama.io.devs.business.responses.FrameworkResponse;
import kodlama.io.devs.business.responses.LanguageResponse;
import kodlama.io.devs.dataAccess.abstracts.FrameworkRepository;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Framework;
import kodlama.io.devs.entities.concretes.Language;
import kodlama.io.devs.mapper.FrameworkMapper;
import kodlama.io.devs.mapper.LanguageMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FrameworkManager implements FrameworkService {
    private FrameworkRepository frameworkRepository;
    private FrameworkMapper frameworkMapper;

    public FrameworkManager(FrameworkRepository frameworkRepository, FrameworkMapper frameworkMapper) {
        this.frameworkRepository = frameworkRepository;
        this.frameworkMapper = frameworkMapper;
    }

    @Override
    public List<FrameworkResponse> getall() {
        return getAllLanguagesResponse(frameworkRepository.findAll());
    }

    @Override
    public FrameworkResponse add(FrameworkRequest frameworkRequest) {
        isNameExist(frameworkRequest.getName());
        Framework framework = frameworkMapper.convertFrameworkRequest2Framework(frameworkRequest);
        return frameworkMapper.convertFramework2FrameworkResponse(frameworkRepository.saveAndFlush(framework));
    }

    @Override
    public void delete(FrameworkRequest frameworkRequest) {
        Framework framework = frameworkMapper.convertFrameworkRequest2Framework(frameworkRequest);
        frameworkRepository.delete(framework);
    }

    @Override
    public FrameworkResponse update(FrameworkRequest frameworkRequest) {
        isNameExist(frameworkRequest.getName());
        Framework framework = frameworkMapper.convertFrameworkRequest2Framework(frameworkRequest);
        return frameworkMapper.convertFramework2FrameworkResponse(frameworkRepository.saveAndFlush(framework));
    }

    @Override
    public FrameworkResponse getById(int id) {
        Framework framework = frameworkRepository.findById(id).orElseThrow(() -> new RuntimeException(String.format("There is no Framework with id %s\n", id)));
        return frameworkMapper.convertFramework2FrameworkResponse(framework);
    }
    private List<FrameworkResponse> getAllLanguagesResponse(List<Framework> frameworks){
        List<FrameworkResponse> frameworkResponses = new ArrayList<>();
        for(Framework framework: frameworks){
            frameworkResponses.add(frameworkMapper.convertFramework2FrameworkResponse(framework));
        }
        return frameworkResponses;
    }
    private void isNameExist(String name){
        if(frameworkRepository.findByName(name).isPresent()){
            throw new RuntimeException(String.format("There is Framework with name %s \n", name));
        }
    }
}
