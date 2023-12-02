package finalProject.fishTank.model;


import jakarta.persistence.*;

@Entity
@Table(name = "aquarium")
public class Tank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "volume", nullable = false)
    private double volume;

    @Column(name = "lenght", nullable = false)
    private double lenght;

    @Column(name = "hight", nullable = false)
    private double hight;

    @Column(name = "depth", nullable = false)
    private double depth;

//    @ManyToOne
//    @JoinColumn(name = "id")
//    private Fish fish;
}
