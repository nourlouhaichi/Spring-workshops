package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.repository.BlocRepository;
import tn.esprit.tpfoyer.services.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/bloc")
public class BlocController {
    @Autowired
    IBlocService blocService;

    @Autowired
    BlocRepository blocRepository;

    @PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @PutMapping("/updateBloc")
    Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    @GetMapping("/retreiveAllBlocs")
    List<Bloc> retreiveAllBloc() {
        return blocService.retreiveAllBlocs();
    }

    @GetMapping("/retreiveBloc/{id}")
    Bloc retreiveBloc(@PathVariable long id) {
        return blocService.retreiveBloc(id);
    }

    @DeleteMapping("/deleteBloc/{id}")
    void deleteBloc(@PathVariable long id){
        blocService.deleteBloc(id);
    }


    @PutMapping("/assignBlocToFoyer/{idBloc}/{idFoyer}")
    public Bloc assignBlocToFoyer(@PathVariable Long idBloc, @PathVariable Long idFoyer) {
        return blocService.assignBlocToFoyer(idBloc, idFoyer);
    }

    @PostMapping("/addBlocAndAssignToFoyer/{idFoyer}")
    public Bloc addBlocAndAssignToFoyer(@RequestBody Bloc bloc, @PathVariable Long idFoyer) {
        return blocService.addBlocAndAssignToFoyer(bloc, idFoyer);
    }

    @PutMapping("/desaffecterBlocFromFoyer/{idBloc}")
    public Bloc desaffecterBlocFromFoyer(@PathVariable Long idBloc) {
        return blocService.desaffecterBlocFromFoyer(idBloc);
    }

    @GetMapping("/retrieveAllBlocWithoutFoyer")
    public List<Bloc> findAllByFoyerIsNull(){
        return blocRepository.findAllByFoyerIsNull();
    }
    @GetMapping("/retrieveBlocByCapaciteBlocGreaterThan/{capaciteBloc}")
    public List<Bloc> findAllByCapaciteBlocGreaterThan(@PathVariable Long capaciteBloc){
        return blocRepository.findAllByCapaciteBlocGreaterThan(capaciteBloc);
    }
}
