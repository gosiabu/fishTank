package finalProject.fishTank.repository;

import finalProject.fishTank.model.Fish;
import finalProject.fishTank.model.Water;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaterRepository extends JpaRepository<Water, Long> {
    Fish findByKindOfWater(String kindOfWater);

}
