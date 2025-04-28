package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository <Chambre, Long> {

    List<Chambre> findAllByTypeChambre(TypeChambre tc);
    Chambre findChambreByNumeroChambre(Long numC);

    @Query("SELECT c FROM Chambre c JOIN c.reservations r JOIN r.etudiants e WHERE e.cin = :cin AND r.estValide = true")
    Chambre findChambreByEtudiantCinAndReservationValide(@Param("cin") Long cin);


}
