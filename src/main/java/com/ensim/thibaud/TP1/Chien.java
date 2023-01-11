package com.ensim.thibaud.TP1;

public class Chien extends Animal{

    public Chien(){
        typeAnimal = TypeAnimal.CHIEN;
    }

    @Override
    public String getNomAnimal() {
        return "Chien";
    }
}
