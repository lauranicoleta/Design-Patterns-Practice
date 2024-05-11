package cts.test2_practice.decorator.banca;

public class Plata implements PlataCard{
    private double suma;

    public Plata(double suma) {
        this.suma = suma;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    @Override
    public void plataNormala() {
        System.out.println("Ati realizat o plata normala in valoare de " + this.suma);
    }

    @Override
    public void plataOnline() {
        System.out.println("Ati realizat o plata online in valoare de " + this.suma);
    }
}
