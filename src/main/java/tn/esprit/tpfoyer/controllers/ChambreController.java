package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {

    @Autowired
    IChambreService chambreService;

    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @PutMapping ("/updateChambre")
    Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }

    @GetMapping("/retreiveAllChambres")
    List<Chambre> retreiveAllChambre() {
        return chambreService.retreiveAllChambres();
    }

    @GetMapping("/retreiveChambre/{id}")
    Chambre retreiveChambre(@PathVariable long id) {
        return chambreService.retreiveChambre(id);
    }

    @DeleteMapping("/deleteChambre/{id}")
    void deleteChambre(@PathVariable long id){
        chambreService.deleteChambre(id);
    }


    @PutMapping("/assignChambreToBloc/{idChambre}/{idBloc}")
    public Chambre assignChambreToBloc(@PathVariable Long idChambre, @PathVariable Long idBloc) {
        return chambreService.assignChambreToBloc(idChambre, idBloc);
    }

    @PostMapping("/addChambreAndAssignToBloc/{idBloc}")
    public Chambre addChambreAndAssignToBloc(@RequestBody Chambre chambre, @PathVariable Long idBloc) {
        return chambreService.addChambreAndAssignToBloc(chambre, idBloc);
    }

    @PutMapping("/desaffecterChambreFromBloc/{idChambre}")
    public Chambre desaffecterChambreFromBloc(@PathVariable Long idChambre) {
        return chambreService.desaffecterChambreFromBloc(idChambre);
    }


    @PutMapping("/assignReservationToChambre/{idReservation}/{idChambre}")
    public Chambre assignReservationToChambre(@PathVariable String idReservation, @PathVariable Long idChambre) {
        return chambreService.assignReservationToChambre(idReservation, idChambre);
    }

    @PostMapping("/addReservationAndAssignToChambre/{idChambre}")
    public Chambre addReservationAndAssignToChambre(@RequestBody Reservation reservation, @PathVariable Long idChambre) {
        return chambreService.addReservationAndAssignToChambre(reservation, idChambre);
    }

    @PutMapping("/removeReservationFromChambre/{idReservation}/{idChambre}")
    public Chambre removeReservationFromChambre(@PathVariable String idReservation, @PathVariable Long idChambre) {
        return chambreService.removeReservationFromChambre(idReservation, idChambre);
    }
}
