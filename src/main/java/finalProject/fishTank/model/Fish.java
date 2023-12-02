package finalProject.fishTank.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class Fish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String englishName;
    private String latinName;
    private double minSizeCm;
    private double maxSizeCm;
    private double minPH;
    private double maxPH;
    private boolean isAggressiveTowardsOthers;
}
