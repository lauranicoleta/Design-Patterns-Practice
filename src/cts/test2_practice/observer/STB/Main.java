package cts.test2_practice.observer.STB;


public class Main {
    public static void main(String[] args){
        Observer calator1 = new Calator("Ana");
        Observer calator2 = new Calator("Titus");

        Subject companie = new CompaniaSTB("STB");
        companie.adaugaUtilizator(calator1);
        companie.adaugaUtilizator(calator2);
        companie.notificaUtilizatoriAutobuzulPleaca();
    }
}
