package cts.test2_practice.observer.banca;

public class Main {
    public static void main(String[] args){
        Observer ab1 = new Abonat("Larisa");
        Observer ab2 = new Abonat("Mariluuuu");

        Subject banca = new Banca();
        banca.adaugaAbonat(ab1);
        banca.adaugaAbonat(ab2);

        banca.notificaNoiOferte();
    }
}
