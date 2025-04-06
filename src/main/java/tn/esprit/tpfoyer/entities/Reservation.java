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
public class Reservation {
    @Id
    String idReservation;
    Date anneeUniversitaire;
    Boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Etudiant> etudiants;

}