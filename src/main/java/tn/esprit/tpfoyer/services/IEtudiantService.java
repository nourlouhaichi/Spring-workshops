package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    void deleteEtudiant(long id);
    List<Etudiant> retreiveAllEtudiants();
    Etudiant retreiveEtudiant(long id);
}
