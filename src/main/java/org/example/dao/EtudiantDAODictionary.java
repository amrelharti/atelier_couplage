package org.example.dao;

import java.util.HashMap;
import java.util.Map;

public class EtudiantDAODictionary {
    private Map<Integer,Etudiant> etudiantMap =new HashMap<>();
    public Etudiant addEtudiant(Etudiant etudiant){
        etudiantMap.put(etudiant.getId(), etudiant);
        return etudiant;
    }
    public Map<Integer,Etudiant> getAllEtudiants(){
        return etudiantMap;
    }
    public Etudiant getEtudiantById(Integer id) {
        return etudiantMap.get(id);
    }

    public Etudiant removeEtudiant(Integer id) {
        return etudiantMap.remove(id);
    }
}
