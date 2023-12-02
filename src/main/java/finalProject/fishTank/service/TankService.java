package finalProject.fishTank.service;

import finalProject.fishTank.repository.FishRepository;
import finalProject.fishTank.repository.TankRepository;

public class TankService {

    private final TankRepository tankRepository;


    public TankService(TankRepository tankRepository) {
        this.tankRepository = tankRepository;
    }
}
