package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.services.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    IReservationService reservationService;

    @PostMapping("/addReservation")
    Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @PutMapping("/updateReservation")
    Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @GetMapping("/retreiveAllReservations")
    List<Reservation> retreiveAllReservations() {
        return reservationService.retreiveAllReservations();
    }

    @GetMapping("/retreiveReservation/{id}")
    Reservation retreiveReservation(@PathVariable String id) {
        return reservationService.retreiveReservation(id);
    }

    @DeleteMapping("/deleteReservation/{id}")
    void deleteReservation(@PathVariable String id){
        reservationService.deleteReservation(id);
    }
}
