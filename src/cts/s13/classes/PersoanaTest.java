package cts.s13.classes;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {

    @org.junit.jupiter.api.Test
    void getSexReturnF() {
        Persoana pers1 = new Persoana("Ana", "60255663789490");
        assertEquals(pers1.getSex(), "F");
    }

    @org.junit.jupiter.api.Test
    void getSexReturnM() {
        Persoana pers2 = new Persoana("Andrei", "10255663789490");
        assertEquals(pers2.getSex(), "M");
    }

    @org.junit.jupiter.api.Test
    void getSexReturnLimitaInferioara() {
        Persoana pers2 = new Persoana("Andrei", "10255663789490");
        assertEquals(pers2.getSex(), "M");
    }
    @org.junit.jupiter.api.Test
    void getSexParitateCrossCheck() {
        String cnp = "10255663789490";
        Persoana pers2 = new Persoana("Andrei", cnp );
        String sex;
        if(Integer.valueOf(cnp.charAt(0)) %2 == 0){
            sex = String.valueOf("F");
        }else{
            sex = String.valueOf("M");
        }
        assertEquals(pers2.getSex(), sex);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    void getSexErrorCheck() {
        Persoana pers2 = new Persoana("Andrei", "90255663789490");
        pers2.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    void getSexErrorCheckCNPStartsWith0() {
        Persoana pers2 = new Persoana("Andrei", "0255663789490");
        pers2.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    void getSexErrorCheckEmptyString() {
        Persoana pers2 = new Persoana("Andrei", "");
        pers2.getSex();
    }

    @org.junit.Test(timeout = 200)
    void getSexPerformance() {
        Persoana pers2 = new Persoana("Andrei", "60255663789490");
        pers2.getSex();
    }

    @org.junit.jupiter.api.Test
    void getSexCorrect() {
        Persoana pers2 = new Persoana("Andrei", "10255663789490");
        assertEquals(1,pers2.getSex().length());
    }

    @org.junit.jupiter.api.Test
    void getSexCorrectLetter() {
        Persoana pers2 = new Persoana("Andrei", "10255663789490");
        boolean isCorrect = pers2.getSex().equals("M") || pers2.getSex().equals("F");
        assertTrue(isCorrect);
    }

    @org.junit.jupiter.api.Test
    void getSexOrder() {
        Persoana pers2 = new Persoana("Andrei", "10255663789490");
        Persoana pers3 = new Persoana("Simona", "60255663789490");
        assertTrue(pers2.getSex().compareTo(pers3.getSex()) > 0);
    }

    @org.junit.jupiter.api.Test
    void getSexRange() {
        Persoana pers2 = new Persoana("Andrei", "80255663789490");
        assertEquals(pers2.getSex(), "F");
    }

    @org.junit.Test(expected = NullPointerException.class)
    void getSexExistance() {
        Persoana pers2 = new Persoana("Andrei", null);
        pers2.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    void getSexCardinality() {
        Persoana pers2 = new Persoana("Andrei", "0");
        pers2.getSex();
    }
}