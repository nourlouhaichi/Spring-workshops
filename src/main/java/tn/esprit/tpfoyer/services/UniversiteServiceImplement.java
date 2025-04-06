package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.repository.FoyerRepository;
import tn.esprit.tpfoyer.repository.UniversiteRepository;

import java.util.List;

@Service
public class UniversiteServiceImplement implements IUniversiteService{

    @Autowired
    UniversiteRepository universiteRepository;

    @Autowired
    FoyerRepository foyerRepository;

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(long id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public List<Universite> retreiveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retreiveUniversite(long id) {
        return universiteRepository.findById(id).get();
    }



    @Override
    public Universite addUniversiteAndFoyerAndAssign(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite assignFoyerToUniversite(Long idUniversite, Long idFoyer) {
        Universite universite = universiteRepository.findById(idUniversite).get();
        Foyer foyer = foyerRepository.findById(idFoyer).get();
        universite.setFoyer(foyer);
        return universiteRepository.save(universite);
    }

    @Override
    public Universite addUniversiteAndAssignUniversiteToFoyer(Universite universite, Long idFoyer) {
        Foyer foyer = foyerRepository.findById(idFoyer).get();
        universite.setFoyer(foyer);
        return universiteRepository.save(universite);
    }

    @Override
    public Universite DesaffecterFoyerFromUniversite(Long idUniversite) {
        Universite universite= universiteRepository.findById(idUniversite).get();
        universite.setFoyer(null);
        return universiteRepository.save(universite);
    }
}
