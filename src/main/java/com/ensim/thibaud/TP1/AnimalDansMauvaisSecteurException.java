package com.ensim.thibaud.TP1;

public class AnimalDansMauvaisSecteurException extends Exception{
    @Override
    public String toString() {
        return "Cet animal est dans le mauvais secteur.";
    }
}
