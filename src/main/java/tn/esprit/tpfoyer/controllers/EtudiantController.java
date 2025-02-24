package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {

    @Autowired
    IEtudiantService etudiantService;

    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    @PutMapping("/updateEtudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }

    @GetMapping("/retreiveAllEtudiants")
    List<Etudiant> retreiveAllEtudiant() {
        return etudiantService.retreiveAllEtudiants();
    }

    @GetMapping("/retreiveEtudiant/{id}")
    Etudiant retreiveEtudiant(@PathVariable long id) {
        return etudiantService.retreiveEtudiant(id);
    }

    @DeleteMapping("/deleteEtudiant/{id}")
    void deleteEtudiant(@PathVariable long id){
        etudiantService.deleteEtudiant(id);
    }
}
