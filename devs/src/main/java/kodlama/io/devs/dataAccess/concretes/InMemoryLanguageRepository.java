package kodlama.io.devs.dataAccess.concretes;

import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    private List<Language> languageList;

    public InMemoryLanguageRepository() {
        languageList = new ArrayList<Language>();
        languageList.add(new Language(1, "Java"));
        languageList.add(new Language(2, "C"));
        languageList.add(new Language(3, "C++"));
        languageList.add(new Language(4, "Python"));

    }

    @Override
    public List<Language> getAll() {
        return languageList;
    }

    public List<Language> add(Language language) {
        languageList.add(language);
        return  languageList;
    }

    public List<Language> delete(int id) {
        for (int i = 0; i < languageList.size(); i++) {
            if (languageList.get(i).getId() == id) {
                languageList.remove(i);
            }
        }
        return languageList;
    }

    public List<Language> update(Language language) {
        for (int i = 0; i < languageList.size(); i++) {
            if (languageList.get(i).getId() == language.getId()) {
                languageList.get(i).setName(language.getName());
            }
        }
        return languageList;
    }

    public Language getById(int id) {
        for (int i = 0; i < languageList.size(); i++) {
            if (languageList.get(i).getId() == id) {
                return languageList.get(i);
            }
        }
        return null;
    }
}

