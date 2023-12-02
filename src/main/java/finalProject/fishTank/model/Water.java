package finalProject.fishTank.model;

import jakarta.persistence.*;

@Entity
@Table(name = "water")
public class Water {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "temperatureCelsius", nullable = false)
    private double temperatureCelsius;
    @Column(name = "kindOfWater", nullable = false)
    private String  kindOfWater;
    @Column(name = "pH", nullable = false)
    private double pH;
    @Column(name = "GH", nullable = false)
    private double GH;

//    private double KH;
//    private double Fe;
//    private double K;
//    private double Ca;
//    private double Mg;


}
