package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.repository.ChambreRepository;
import tn.esprit.tpfoyer.repository.EtudiantRepository;
import tn.esprit.tpfoyer.repository.ReservationRepository;

import java.util.List;

@Service
public class ReservationServiceImplement implements IReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    EtudiantRepository etudiantRepository;

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(String id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> retreiveAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retreiveReservation(String id) {
        return reservationRepository.findById(id).get();
    }



    @Override
    public Reservation assignEtudiantToReservation(String idReservation, Long idEtudiant) {
        Etudiant etudiant = etudiantRepository.findById(idEtudiant).get();
        Reservation reservation = reservationRepository.findById(idReservation).get();
        reservation.getEtudiants().add(etudiant);
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation assignEtudiantsToReservation(String idReservation, List<Long> idEtudiant) {
        List<Etudiant> etudiants = etudiantRepository.findAllById(idEtudiant);
        Reservation reservation = reservationRepository.findById(idReservation).get();
        reservation.getEtudiants().addAll(etudiants);
        return reservationRepository.save(reservation);
    }

    @Override
    public void desaffecterEtudiantFromReservation(String idReservation, Long idEtudiant) {
        Etudiant etudiant = etudiantRepository.findById(idEtudiant).get();
        Reservation reservation = reservationRepository.findById(idReservation).get();
        reservation.getEtudiants().remove(etudiant);
        reservationRepository.save(reservation);
    }
}
