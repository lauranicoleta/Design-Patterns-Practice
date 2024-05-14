package cts.test2_practice.proxy.farmacie;

public class Vanzare implements Achizitie{
    private double pret;

    public Vanzare(double pret) {
        this.pret = pret;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public void seRealizeazaAchizitia(ClientFar clientFar) {
        System.out.println("Au fost vandute medicamente in valoare de " + pret + " clientului " + clientFar.toString());
    }
}
