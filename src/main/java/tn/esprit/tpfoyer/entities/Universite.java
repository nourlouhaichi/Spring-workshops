package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idUniversite;
    String nomUniversite;
    String adresse;

    @OneToOne
    Foyer foyer;

    public Long getIdUniversite() {
        return idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public Foyer getFoyer() {
        return foyer;
    }

    public void setIdUniversite(Long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }
}
