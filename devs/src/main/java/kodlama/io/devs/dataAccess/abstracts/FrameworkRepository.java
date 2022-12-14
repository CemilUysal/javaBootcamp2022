package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concretes.Framework;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FrameworkRepository extends JpaRepository<Framework, Integer> {
    Optional<Framework> findByName(String name);
}
