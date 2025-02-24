package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
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
}
