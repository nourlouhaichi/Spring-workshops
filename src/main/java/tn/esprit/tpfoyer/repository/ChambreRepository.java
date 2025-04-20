package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository <Chambre, Long> {

    List<Chambre> findAllByTypeChambre(TypeChambre tc);
    Chambre findChambreByNumeroChambre(Long numC);

}
