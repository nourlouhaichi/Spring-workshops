package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer(Foyer foyer);
    void deleteFoyer(long id);
    List<Foyer> retreiveAllFoyers();
    Foyer retreiveFoyer(long id);
}
