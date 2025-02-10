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
}
