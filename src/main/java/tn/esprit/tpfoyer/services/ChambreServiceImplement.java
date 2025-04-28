package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.repository.BlocRepository;
import tn.esprit.tpfoyer.repository.ChambreRepository;
import tn.esprit.tpfoyer.repository.ReservationRepository;

import java.util.List;

@Service
//@AllArgsConstructor
public class ChambreServiceImplement implements IChambreService {

    @Autowired //bch tsir l injection ta3 repository
    ChambreRepository chambreRepository;

    @Autowired
    BlocRepository blocRepository;

    @Autowired
    ReservationRepository reservationRepository;

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


    @Override
    public Chambre assignChambreToBloc(Long idChambre, Long idBloc) {
        Chambre chambre = chambreRepository.findById(idChambre).get();
        Bloc bloc = blocRepository.findById(idBloc).get();
        chambre.setBloc(bloc);
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre addChambreAndAssignToBloc(Chambre chambre, Long idBloc) {
        Bloc bloc = blocRepository.findById(idBloc).get();
        chambre.setBloc(bloc);
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre desaffecterChambreFromBloc(Long idChambre) {
        Chambre chambre = chambreRepository.findById(idChambre).get();
        chambre.setBloc(null);
        return chambreRepository.save(chambre);
    }



    @Override
    public Chambre assignReservationToChambre(String idReservation, Long idChambre) {
        Chambre chambre = chambreRepository.findById(idChambre).get();
        Reservation reservation = reservationRepository.findById(idReservation).get();
        chambre.getReservations().add(reservation);

        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre addReservationAndAssignToChambre(Reservation reservation, Long idChambre) {
        Chambre chambre = chambreRepository.findById(idChambre).get();
        reservation = reservationRepository.save(reservation);
        chambre.getReservations().add(reservation);

        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre removeReservationFromChambre(String idReservation, Long idChambre) {
        Chambre chambre = chambreRepository.findById(idChambre).get();
        chambre.setReservations(null);
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre getChambreByEtudiantCin(Long cin) {
        return chambreRepository.findChambreByEtudiantCinAndReservationValide(cin);
    }
}
