package org.example.metier;

import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAO;

import java.util.List;

public class EtudiantManager {
    public EtudiantDAO etudiantDAO = new EtudiantDAO();


    public Etudiant addEtudiant(Etudiant etudiant){
        for(Etudiant etu : etudiantDAO.getAllEtudiants()){
            if(etu.getEmail().equals(etudiant.getEmail())){
                System.out.println("Email is already in use.");
                return null;
            }
        }
        return etudiantDAO.addEtudiant(etudiant);
    }
    public List<Etudiant> getAllEtudiants(){
        return etudiantDAO.getAllEtudiants();
    }
}
