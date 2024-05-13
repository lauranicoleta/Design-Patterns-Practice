package cts.s10.observer.main;

import cts.s10.observer.classes.Abonat;
import cts.s10.observer.classes.Observer;
import cts.s10.observer.classes.Sala;
import cts.s10.observer.classes.Subject;

public class Main {
    public static void main(String[] args){
        Observer ab1 = new Abonat("Ana");
        Observer ab2 = new Abonat("Ana1");
        Observer ab3 = new Abonat("Ana2");

        Subject sala = new Sala();
        sala.adaugaAbonat(ab1);
        sala.adaugaAbonat(ab2);
        sala.adaugaAbonat(ab3);

        sala.notificaMeciFotbal();
        sala.notificaMeciHandbal();
    }
}
