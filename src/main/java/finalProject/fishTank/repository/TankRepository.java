package finalProject.fishTank.repository;

import finalProject.fishTank.model.Fish;
import finalProject.fishTank.model.Tank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TankRepository extends JpaRepository<Tank, Long> {

    Fish findByVolume(double volume);

}
