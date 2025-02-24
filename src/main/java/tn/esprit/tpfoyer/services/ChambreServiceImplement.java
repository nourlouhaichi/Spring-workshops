package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.repository.ChambreRepository;

import java.util.List;

@Service
//@AllArgsConstructor
public class ChambreServiceImplement implements IChambreService {

    @Autowired //bch tsir l injection ta3 repository
    ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public List<Chambre> retreiveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retreiveChambre(long id) {
        return chambreRepository.findById(id).get();
    }
}
