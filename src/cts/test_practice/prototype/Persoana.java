package cts.test_practice.prototype;

public class Persoana implements PersoanaAbstracta{

    private double dimensiuneCap;
    private double dimensiuneGat;
    private double dimensiuneUmeri;

    public Persoana() {

    }

    public Persoana(double dimensiuneCap, double dimensiuneGat, double dimensiuneUmeri) {
        this.dimensiuneCap = dimensiuneCap;
        this.dimensiuneGat = dimensiuneGat;
        this.dimensiuneUmeri = dimensiuneUmeri;
    }


    @Override
    public PersoanaAbstracta clone() {
       Persoana p = new Persoana();
       p.setDimensiuneCap(this.dimensiuneCap);
       p.setDimensiuneUmeri(this.dimensiuneUmeri);
       p.setDimensiuneGat(this.dimensiuneGat);

       return p;
    }

    public double getDimensiuneCap() {
        return dimensiuneCap;
    }

    public void setDimensiuneCap(double dimensiuneCap) {
        this.dimensiuneCap = dimensiuneCap;
    }

    public double getDimensiuneGat() {
        return dimensiuneGat;
    }

    public void setDimensiuneGat(double dimensiuneGat) {
        this.dimensiuneGat = dimensiuneGat;
    }

    public double getDimensiuneUmeri() {
        return dimensiuneUmeri;
    }

    public void setDimensiuneUmeri(double dimensiuneUmeri) {
        this.dimensiuneUmeri = dimensiuneUmeri;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "dimensiuneCap=" + dimensiuneCap +
                ", dimensiuneGat=" + dimensiuneGat +
                ", dimensiuneUmeri=" + dimensiuneUmeri +
                '}';
    }
}
