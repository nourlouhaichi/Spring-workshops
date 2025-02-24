package tn.esprit.tpfoyer.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEtudiant;
    String nomEt;
    String prenomEt;
    Long cin;
    String ecole;
    Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants")
    List<Reservation> reservations;

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public String getNomEt() {
        return nomEt;
    }

    public String getPrenomEt() {
        return prenomEt;
    }

    public Long getCin() {
        return cin;
    }

    public String getEcole() {
        return ecole;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public void setNomEt(String nomEt) {
        this.nomEt = nomEt;
    }

    public void setPrenomEt(String prenomEt) {
        this.prenomEt = prenomEt;
    }

    public void setCin(Long cin) {
        this.cin = cin;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
