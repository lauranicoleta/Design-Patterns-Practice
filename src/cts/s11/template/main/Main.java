package cts.s11.template.main;

import cts.s11.template.classes.Pacient;
import cts.s11.template.classes.SpitalPublic;

public class Main {
    public static void main(String[] args){
        SpitalPublic spital = new SpitalPublic("De Urgenta Bucuresti", 2);
        Pacient pacient = new Pacient("Elena", 2);
        Pacient pacient1 = new Pacient("Andrei", 1);
        Pacient pacient2 = new Pacient("Ion", 3);

        spital.internare(pacient);
        spital.internare(pacient1);
        spital.internare(pacient2);
    }
}
