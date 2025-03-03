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

}
