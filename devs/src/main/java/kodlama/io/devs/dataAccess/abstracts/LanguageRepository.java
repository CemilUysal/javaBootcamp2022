package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {
    List<Language> getAll();
    List<Language> add(Language language);

    List<Language> delete(int id);
    List<Language> update(Language language);

    Language getById(int id);
}