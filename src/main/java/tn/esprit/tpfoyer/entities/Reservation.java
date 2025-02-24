package tn.esprit.tpfoyer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reservation {
    @Id
    String idReservation;
    Date anneeUniversitaire;
    Boolean estValide;

    @ManyToMany
    List<Etudiant> etudiants;

    public String getIdReservation() {
        return idReservation;
    }

    public Date getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public Boolean getEstValide() {
        return estValide;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public void setEstValide(Boolean estValide) {
        this.estValide = estValide;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}