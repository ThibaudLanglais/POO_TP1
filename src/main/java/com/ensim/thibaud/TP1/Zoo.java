package com.ensim.thibaud.TP1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private int visiteurs;
    private List<Secteur> secteursAnimaux;
    private int nbVisiteursMaxParSecteur;

    public Zoo(int maxVisiteurs){
        nbVisiteursMaxParSecteur = maxVisiteurs;
        secteursAnimaux = new ArrayList<>();
    }

    public void ajouterSecteur(TypeAnimal type){
        secteursAnimaux.add(new Secteur(type));
    }

    public void nouvelAnimal(Animal a) throws AnimalDansMauvaisSecteurException {
        for(Secteur s : secteursAnimaux){
            if(s.obtenirType() == a.getTypeAnimal()) {
                s.ajouterAnimal(a);
                return;
            }
        }
        throw new AnimalDansMauvaisSecteurException();
    }

    public void nouveauVisiteur() throws LimiteVisiteurException{
        if(nbVisiteursMaxParSecteur == visiteurs) throw new LimiteVisiteurException();
        visiteurs++;
    }

    public int getLimiteVisiteur(){
        return nbVisiteursMaxParSecteur;
    }

    public int nombreAnimaux() {
        int somme = 0;
        for (Secteur s : secteursAnimaux) somme += s.getNombreAnimaux();
        return somme;
    }
}
