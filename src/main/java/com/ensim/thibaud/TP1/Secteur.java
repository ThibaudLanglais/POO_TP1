package com.ensim.thibaud.TP1;

import java.util.ArrayList;
import java.util.List;

public class Secteur {
    private TypeAnimal typeAnimauxDansSecteur;
    private List<Animal> animauxDansSecteur;

    public Secteur(TypeAnimal t){
        typeAnimauxDansSecteur = t;
        animauxDansSecteur = new ArrayList<Animal>();
    }

    public void ajouterAnimal(Animal a) throws AnimalDansMauvaisSecteurException{
        if(a.getTypeAnimal() != typeAnimauxDansSecteur) throw new AnimalDansMauvaisSecteurException();
        animauxDansSecteur.add(a);
    }

    public int getNombreAnimaux(){
        return animauxDansSecteur.size();
    }

    public TypeAnimal obtenirType(){
        return typeAnimauxDansSecteur;
    }

}
