package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(long id);
    List<Chambre> retreiveAllChambres();
    Chambre retreiveChambre(long id);

}
