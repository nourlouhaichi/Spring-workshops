package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    void deleteBloc(long id);
    List<Bloc> retreiveAllBlocs();
    Bloc retreiveBloc(long id);


    Bloc assignBlocToFoyer(Long idBloc, Long idFoyer);
    Bloc addBlocAndAssignToFoyer(Bloc bloc, Long idFoyer);
    Bloc desaffecterBlocFromFoyer(Long idBloc);
}
