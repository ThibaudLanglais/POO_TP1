package com.ensim.thibaud.TP1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void main() {

    }

    @Test
    void testLimiteVisiteur(){
        Zoo z = new Zoo(2);
        assertNotNull(z);
        assertDoesNotThrow(()->z.nouveauVisiteur());
        assertDoesNotThrow(()->z.nouveauVisiteur());
        assertThrows(LimiteVisiteurException.class, ()->z.nouveauVisiteur());
    }

    @Test
    void testTypeAnimal(){
        Zoo z = new Zoo(2);
        z.ajouterSecteur(TypeAnimal.CHIEN);
        assertDoesNotThrow(()->z.nouvelAnimal(new Chien()));
        assertThrows(AnimalDansMauvaisSecteurException.class, ()->z.nouvelAnimal(new Chat()));
    }


}