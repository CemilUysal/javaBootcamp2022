package kodlama.io.devs.mapper;

import kodlama.io.devs.business.requests.LanguageRequest;
import kodlama.io.devs.business.responses.LanguageResponse;
import kodlama.io.devs.entities.concretes.Language;
import org.springframework.stereotype.Component;

@Component
public class LanguageMapper {
    public LanguageResponse convertLanguage2LanguageResponse(Language language){
        return new LanguageResponse(language.getId(), language.getName());
    }

    public Language convertLanguageRequest2Language(LanguageRequest languageRequest){
        return new Language(languageRequest.getId(), languageRequest.getName());
    }
}
