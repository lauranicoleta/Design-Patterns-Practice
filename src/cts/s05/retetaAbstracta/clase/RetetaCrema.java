package cts.s05.retetaAbstracta.clase;

public class RetetaCrema implements RetetaAbstracta{
    private String nume;
    private Double cantitate;

    public RetetaCrema(){
        this.nume = "";
        this.cantitate = 0.00;
    }
    public RetetaCrema(String nume, Double cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    @Override
    public RetetaAbstracta clone() {
        RetetaCrema retetaCrema = new RetetaCrema();
        retetaCrema.setNume(this.nume);
        retetaCrema.setCantitate(this.cantitate);
        return retetaCrema;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Double getCantitate() {
        return cantitate;
    }

    public void setCantitate(Double cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "RetetaCrema{" +
                "nume='" + nume + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }
}
