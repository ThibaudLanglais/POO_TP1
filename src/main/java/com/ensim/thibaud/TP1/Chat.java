package com.ensim.thibaud.TP1;

public class Chat extends Animal{

    public Chat(){
        typeAnimal = TypeAnimal.CHAT;
    }

    @Override
    public String getNomAnimal() {
        return "Chat";
    }
}
