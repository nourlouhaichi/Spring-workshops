package tn.esprit.tpfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.repository.EtudiantRepository;

import java.util.List;

@Service
public class EtudiantServiceImplement  implements IEtudiantService{
    @Autowired
    EtudiantRepository etudiantRepository;
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public List<Etudiant> retreiveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant retreiveEtudiant(long id) {
        return etudiantRepository.findById(id).get();
    }
}
