package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.services.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/bloc")
public class BlocController {
    @Autowired
    IBlocService blocService;

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
}
