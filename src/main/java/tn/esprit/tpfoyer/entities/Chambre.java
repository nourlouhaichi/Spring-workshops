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
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idChambre;
    Long numeroChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typeChambre;

    @ManyToOne
    Bloc bloc;

    @OneToMany
    List<Reservation> reservations;

    public Long getIdChambre() {
        return idChambre;
    }

    public Long getNumeroChambre() {
        return numeroChambre;
    }

    public TypeChambre getTypeChambre() {
        return typeChambre;
    }

    public Bloc getBloc() {
        return bloc;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setIdChambre(Long idChambre) {
        this.idChambre = idChambre;
    }

    public void setNumeroChambre(Long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public void setTypeChambre(TypeChambre typeChambre) {
        this.typeChambre = typeChambre;
    }

    public void setBloc(Bloc bloc) {
        this.bloc = bloc;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
