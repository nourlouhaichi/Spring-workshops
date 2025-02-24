package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idFoyer;
    String nomFoyer;
    Long capaciteFoyer;

    @OneToOne(mappedBy = "foyer")
    Universite universite;

    @OneToMany(mappedBy = "foyer")
    List<Bloc> blocs;

    public Long getIdFoyer() {
        return idFoyer;
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public Long getCapaciteFoyer() {
        return capaciteFoyer;
    }

    public Universite getUniversite() {
        return universite;
    }

    public List<Bloc> getBlocs() {
        return blocs;
    }

    public void setIdFoyer(Long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public void setCapaciteFoyer(Long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }

    public void setUniversite(Universite universite) {
        this.universite = universite;
    }

    public void setBlocs(List<Bloc> blocs) {
        this.blocs = blocs;
    }
}
