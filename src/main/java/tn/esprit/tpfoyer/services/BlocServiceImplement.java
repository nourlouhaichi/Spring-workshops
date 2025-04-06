package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.repository.BlocRepository;
import tn.esprit.tpfoyer.repository.FoyerRepository;

import java.util.List;

@Service
public class BlocServiceImplement implements IBlocService {

    @Autowired
    BlocRepository blocRepository;

    @Autowired
    FoyerRepository foyerRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public List<Bloc> retreiveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retreiveBloc(long id) {
        return blocRepository.findById(id).get();
    }


    @Override
    public Bloc assignBlocToFoyer(Long idBloc, Long idFoyer) {
        Bloc bloc = blocRepository.findById(idBloc).get();
        Foyer foyer = foyerRepository.findById(idFoyer).get();
        bloc.setFoyer(foyer);
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc addBlocAndAssignToFoyer(Bloc bloc, Long idFoyer) {
        Foyer foyer = foyerRepository.findById(idFoyer).get();
        bloc.setFoyer(foyer);
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc desaffecterBlocFromFoyer(Long idBloc) {
        Bloc bloc = blocRepository.findById(idBloc).get();
        bloc.setFoyer(null);
        return blocRepository.save(bloc);
    }

}
