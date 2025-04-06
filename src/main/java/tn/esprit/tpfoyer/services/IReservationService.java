package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(String id);
    List<Reservation> retreiveAllReservations();
    Reservation retreiveReservation(String id);


    public Reservation assignEtudiantToReservation(String idReservation, Long idEtudiant);
    public Reservation assignEtudiantsToReservation(String idReservation, List<Long> idEtudiant);
    public void desaffecterEtudiantFromReservation(String idReservation, Long idEtudiant);


}
