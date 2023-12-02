package finalProject.fishTank.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "fish")
public class Fish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "englishName", nullable = false)
    private String englishName;

    @Column(name = "latinName", nullable = false)
    private String latinName;

    @Column(name = "minSizeCm", nullable = false)
    private double minSizeCm;

    @Column(name = "maxSizeCm", nullable = false)
    private double maxSizeCm;
    @Column(name = "minPH", nullable = false)
    private double minPH;

    @Column(name = "maxPH", nullable = false)
    private double maxPH;
    @Column(name = "isAggressiveTowardsOthers", nullable = false)
    private boolean isAggressiveTowardsOthers;

    public Fish(Long id, String englishName, String latinName, double minSizeCm, double maxSizeCm, double minPH, double maxPH){
        this.id = id;
        this.englishName = englishName;
        this.latinName= latinName;
        this.minPH = minPH;
        this.maxPH = maxPH;
        this.minSizeCm=minSizeCm;
        this.maxSizeCm=maxSizeCm;
    }

    public Fish() {

    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getEnglishName() {
        return englishName;
    }
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getLatinName() {
        return latinName;
    }
    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

//    public List<Tank> getTanks() {
//        return tanks;
//    }
//    public void setTanks(List<Tank> tanks) {
//        this.tanks = tanks;
//    }
//    @OneToMany(mappedBy = "user")
//    private List<Tank> tanks;


}
