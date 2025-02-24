package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.services.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyer")
public class FoyerController {
    @Autowired
    IFoyerService foyerService;

    @PostMapping("/addFoyer")
    Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    @PutMapping("/updateFoyer")
    Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }

    @GetMapping("/retreiveAllFoyers")
    List<Foyer> retreiveAllFoyer() {
        return foyerService.retreiveAllFoyers();
    }

    @GetMapping("/retreiveFoyer/{id}")
    Foyer retreiveFoyer(@PathVariable long id) {
        return foyerService.retreiveFoyer(id);
    }

    @DeleteMapping("/deleteFoyer/{id}")
    void deleteFoyer(@PathVariable long id){
        foyerService.deleteFoyer(id);
    }
}
