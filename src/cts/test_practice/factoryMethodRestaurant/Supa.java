package cts.test_practice.factoryMethodRestaurant;

public abstract class Supa {

    private String denumire;
    private double cantitate;

    public Supa(String denumire, double cantitate) {
        this.denumire = denumire;
        this.cantitate = cantitate;
    }

    public abstract void afisareDetalii();

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public double getCantitate() {
        return cantitate;
    }

    public void setCantitate(double cantitate) {
        this.cantitate = cantitate;
    }
}
