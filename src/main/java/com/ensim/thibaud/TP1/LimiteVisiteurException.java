package com.ensim.thibaud.TP1;

public class LimiteVisiteurException extends Exception{
    @Override
    public String toString() {
        return "La limite du nombre de visiteurs a été atteinte.";
    }
}
