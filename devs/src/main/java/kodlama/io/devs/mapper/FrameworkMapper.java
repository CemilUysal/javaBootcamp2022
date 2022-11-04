package kodlama.io.devs.mapper;

import kodlama.io.devs.business.requests.FrameworkRequest;
import kodlama.io.devs.business.requests.LanguageRequest;
import kodlama.io.devs.business.responses.FrameworkResponse;
import kodlama.io.devs.business.responses.LanguageResponse;
import kodlama.io.devs.entities.concretes.Framework;
import kodlama.io.devs.entities.concretes.Language;
import org.springframework.stereotype.Component;

@Component
public class FrameworkMapper {
    LanguageMapper languageMapper;

    public FrameworkMapper(LanguageMapper languageMapper) {
        this.languageMapper = languageMapper;
    }

    public FrameworkResponse convertFramework2FrameworkResponse(Framework framework){
        LanguageResponse languageResponse = languageMapper.convertLanguage2LanguageResponse(framework.getLanguage());
        return new FrameworkResponse(framework.getId(), framework.getName(), languageResponse);
    }

    public Framework convertFrameworkRequest2Framework(FrameworkRequest frameworkRequest){
        Language language = languageMapper.convertLanguageRequest2Language(frameworkRequest.getLanguageRequest());
        return new Framework(frameworkRequest.getId(), frameworkRequest.getName(), language);
    }
}
