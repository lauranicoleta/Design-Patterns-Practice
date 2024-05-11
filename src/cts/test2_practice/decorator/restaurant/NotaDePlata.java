package cts.test2_practice.decorator.restaurant;

public class NotaDePlata implements Nota{
    private int nrMasa;
    private double suma;

    public NotaDePlata(int nrMasa, double suma) {
        this.nrMasa = nrMasa;
        this.suma = suma;
    }
    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Nota pentru masa " + this.nrMasa + " are valoarea totala de " + this.suma + " lei.");
    }
}
