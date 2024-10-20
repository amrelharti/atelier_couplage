package org.example.presentation;

import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAODictionary;
import org.example.metier.EtudiantManager;


public class Presentation {
    public static void main(String[] args) {
        EtudiantDAODictionary etudiantDAO = new EtudiantDAODictionary();

        Etudiant e1=new Etudiant(1,"lewis","hamilton","lewish@gmail.com");
        Etudiant e2=new Etudiant(2,"daniel","ricciardo","dannyric@gmail.com");
        Etudiant e3=new Etudiant(3,"lando","norris","lando4@gmail.com");
        Etudiant e4=new Etudiant(4,"max","verstappen","madmax@gmail.com");

        etudiantDAO.addEtudiant(e1);etudiantDAO.addEtudiant(e2);etudiantDAO.addEtudiant(e3);etudiantDAO.addEtudiant(e4);
        for (Etudiant etudiant : etudiantDAO.getAllEtudiants().values()) {
            System.out.println(etudiant);
        }
    }
}
