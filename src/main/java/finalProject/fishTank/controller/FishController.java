package finalProject.fishTank.controller;

import finalProject.fishTank.model.Fish;
import finalProject.fishTank.repository.FishRepository;
import finalProject.fishTank.repository.TankRepository;
import finalProject.fishTank.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/fish")
public class FishController {

    private final FishRepository fishRepository;
    private final TankRepository tankRepository;


    @Autowired
    public FishController(FishRepository fishRepository, TankRepository tankRepository){
        this.fishRepository = fishRepository;
        this.tankRepository = tankRepository;
    }


    @GetMapping
    public String showAllFish(Model model) {
        // Get all fish and show'em
        List<Fish> allFish = fishRepository.findAll();
        model.addAttribute("fish", allFish);

        return "fish";
    }
}
