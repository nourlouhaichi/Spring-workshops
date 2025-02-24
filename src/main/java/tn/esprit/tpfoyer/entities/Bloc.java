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
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idBloc;
    String nomBloc;
    Long capaciteBloc;

    @ManyToOne
    Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    List<Chambre> chambres;

    public Long getIdBloc() {
        return idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public Long getCapaciteBloc() {
        return capaciteBloc;
    }

    public Foyer getFoyer() {
        return foyer;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public void setIdBloc(Long idBloc) {
        this.idBloc = idBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public void setCapaciteBloc(Long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }

    public void setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }
}
