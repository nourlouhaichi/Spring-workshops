package tn.esprit.tpfoyer.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.services.IBlocService;
import tn.esprit.tpfoyer.services.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteController {

    @Autowired
    IUniversiteService universiteService;

    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @PutMapping("/updateUniversite")
    Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    @GetMapping("/retreiveAllUniversite")
    List<Universite> retreiveAllUniversite() {
        return universiteService.retreiveAllUniversites();
    }

    @GetMapping("/retreiveUniversite/{id}")
    Universite retreiveUniversite(@PathVariable long id) {
        return universiteService.retreiveUniversite(id);
    }

    @DeleteMapping("/deleteUniversite/{id}")
    void deleteUniversite(@PathVariable long id){
        universiteService.deleteUniversite(id);
    }


    @PostMapping("/addUniversiteAndFoyer")
    public Universite addUniversiteAndFoyer(@RequestBody Universite universite) {
        return universiteService.addUniversiteAndFoyerAndAssign(universite);
    }

    @PutMapping("/assignFoyerToUniversite/{idUniversite}/{idFoyer}")
    public Universite assignFoyerToUniversite(@PathVariable Long idUniversite, @PathVariable Long idFoyer) {
        return universiteService.assignFoyerToUniversite(idUniversite, idFoyer);
    }

    @PostMapping("/addUniversiteAndAssignFoyer/{idFoyer}")
    public Universite addUniversiteAndAssignFoyer(@RequestBody Universite universite, @PathVariable Long idFoyer) {
        return universiteService.addUniversiteAndAssignUniversiteToFoyer(universite, idFoyer);
    }

    @PutMapping("/desaffecterFoyerFromUniversite/{idUniversite}")
    public Universite desaffecterFoyerFromUniversite(@PathVariable Long idUniversite) {
        return universiteService.DesaffecterFoyerFromUniversite(idUniversite);
    }


}
