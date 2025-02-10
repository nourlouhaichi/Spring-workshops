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
}
