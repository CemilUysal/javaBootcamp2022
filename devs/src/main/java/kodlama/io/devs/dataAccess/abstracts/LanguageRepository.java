package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
    Optional<Language> findByName(String name);

}