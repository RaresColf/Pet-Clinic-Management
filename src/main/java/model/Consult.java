package model;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table
public class Consult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private Date dateOfConsult;
    @Column
    private String description;

@ManyToOne
@JoinColumn(name = "pet_id")
    private Pet pet;

@ManyToOne
@JoinColumn(name = "vet_id")
private Vet vet;

    public Consult(Date dateOfConsult, String description) {
        this.dateOfConsult = dateOfConsult;
        this.description = description;
    }

    public Consult() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateOfConsult() {
        return dateOfConsult;
    }

    public void setDateOfConsult(Date dateOfConsult) {
        this.dateOfConsult = dateOfConsult;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }


    @Override
    public String toString() {
        return "Consult{" +
                "id=" + id +
                ", dateOfConsult=" + dateOfConsult +
                ", description='" + description + '\'' +
                '}';
    }
}
