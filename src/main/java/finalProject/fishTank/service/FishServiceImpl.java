package finalProject.fishTank.service;

import finalProject.fishTank.model.Fish;
import finalProject.fishTank.repository.FishRepository;

import java.util.List;

public abstract class FishServiceImpl {

    private final FishRepository fishRepository;


    public FishServiceImpl(FishRepository fishRepository) {
        this.fishRepository = fishRepository;
    }

}
