package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.repository.FoyerRepository;

import java.util.List;

@Service
public class FoyerServiceImplement implements IFoyerService{
    @Autowired
    FoyerRepository foyerRepository;


    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(long id) {
        foyerRepository.deleteById(id);
    }

    @Override
    public List<Foyer> retreiveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer retreiveFoyer(long id) {
        return foyerRepository.findById(id).get();
    }
}
