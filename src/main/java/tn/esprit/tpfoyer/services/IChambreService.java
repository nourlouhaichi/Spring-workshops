package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Reservation;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(long id);
    List<Chambre> retreiveAllChambres();
    Chambre retreiveChambre(long id);


    Chambre assignChambreToBloc(Long idChambre, Long idBloc);
    Chambre addChambreAndAssignToBloc(Chambre chambre, Long idBloc);
    Chambre desaffecterChambreFromBloc(Long idChambre);


    Chambre assignReservationToChambre(String idReservation, Long idChambre);
    Chambre addReservationAndAssignToChambre(Reservation reservation, Long idChambre);
    Chambre removeReservationFromChambre(String idReservation, Long idChambre);

    public Chambre getChambreByEtudiantCin(Long cin);


}
