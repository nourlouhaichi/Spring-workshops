package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void deleteUniversite(long id);
    List<Universite> retreiveAllUniversites();
    Universite retreiveUniversite(long id);
}
