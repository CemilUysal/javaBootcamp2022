package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getall();
    List<Language> add(Language language);

    List<Language> delete(int id);
    List<Language> update(Language language);

    Language getById(int id);
}
