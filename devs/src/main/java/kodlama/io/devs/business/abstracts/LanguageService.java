package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.business.requests.LanguageRequest;
import kodlama.io.devs.business.responses.LanguageResponse;
import kodlama.io.devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<LanguageResponse> getall();
    LanguageResponse add(LanguageRequest languageRequest);

    void delete(LanguageRequest languageRequest);
    LanguageResponse update(LanguageRequest languageRequest);

    LanguageResponse getById(int id);
}
