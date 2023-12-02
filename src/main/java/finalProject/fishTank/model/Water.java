package finalProject.fishTank.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Water {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double temperatureCelsius;

    private String  kindOfWater;

    private double pH;
    private double GH;
    private double KH;
    private double Fe;
    private double K;
    private double Ca;
    private double Mg;


}
