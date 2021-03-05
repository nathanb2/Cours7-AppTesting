package com.example.cours7_apptesting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    /**
     * On utilise assert pour compare le resultat attendu avec le resultat reel de la fonction appele
     */
    @Test
    public void pow_isCorrect(){
        assertEquals(4, metAuCarre(2), 0);
        assertNotEquals(4, metAuCarre(3), 0);
    }

    /**
     * cette fonction n'est la que pour l'exemple , normalement on test les fonctiosn de notre code et ne creons pas de fonctions pour les tester!
     *
     * Model parfait de fonction qui recoit un param, fait sa logique et retourne le resultat, parfaitement lisible et testabel!
     * @param number parametre recu
     * @return resultat retourne
     */
    public double metAuCarre(double number){
        return number * number;
    }
}