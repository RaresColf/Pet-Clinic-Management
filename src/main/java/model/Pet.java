package model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table
public class Pet {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
    private Integer id;
@Column
    private String race;
@Column
    private Date birthdate;
@Column
    private Boolean isVaccinated;
@Column
    private String ownerName;

@ManyToOne
@JoinColumn(name = "vet_id")
private Vet vet;

@OneToMany(mappedBy = "pet")
private List<Pet> pets;

    public Pet(String race, Date birthdate, Boolean isVaccinated, String ownerName) {
        this.race = race;
        this.birthdate = birthdate;
        this.isVaccinated = isVaccinated;
        this.ownerName = ownerName;
    }

    public Pet() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Boolean getVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }


    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", race='" + race + '\'' +
                ", birthdate=" + birthdate +
                ", isVaccinated=" + isVaccinated +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}


