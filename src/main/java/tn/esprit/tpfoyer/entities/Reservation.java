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


}