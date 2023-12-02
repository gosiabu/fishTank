package finalProject.fishTank.repository;

import finalProject.fishTank.model.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FishRepository extends JpaRepository<Fish, Long> {

    Fish findByEnglishName(String englishName);

    List<Fish> findAll();


}
