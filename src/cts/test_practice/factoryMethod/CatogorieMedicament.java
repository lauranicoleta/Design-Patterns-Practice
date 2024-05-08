package cts.test_practice.factoryMethod;

public abstract class CatogorieMedicament {

    private String denumire;
    private double pret;

    public CatogorieMedicament(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public abstract void afisareDetalii();

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "CatogorieMedicament{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}
