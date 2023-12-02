package finalProject.fishTank.service;

import finalProject.fishTank.model.Fish;
import finalProject.fishTank.repository.FishRepository;
import org.springframework.stereotype.Service;

import java.time.chrono.Era;
import java.util.List;

@Service
public class FishService {

    private FishRepository fishRepository;

    public List<Fish> getAllFish() {
        return fishRepository.findAll();
    }

//    public FishService(FishRepository fishRepository) {
//        this.fishRepository = fishRepository;
//    }

}
