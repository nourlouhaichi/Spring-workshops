package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.repository.BlocRepository;

import java.util.List;

@Service
public class BlocServiceImplement implements IBlocService {
    @Autowired
    BlocRepository blocRepository;

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
}
