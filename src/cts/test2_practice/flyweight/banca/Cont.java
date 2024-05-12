package cts.test2_practice.flyweight.banca;

public class Cont implements Flyweight{

    private String nrCont;
    private double suma;

    public Cont(String nrCont, double suma) {
        this.nrCont = nrCont;
        this.suma = suma;
    }
    @Override
    public void memoreazaBanca(CaracteristiciBanca caracteristiciBanca) {
        System.out.println(this + " " + caracteristiciBanca);
    }

    @Override
    public void memoreazaDetinator(CaracteristiciDetinator caracteristiciDetinator) {
        System.out.println(this + " " + caracteristiciDetinator);
    }

    @Override
    public String toString() {
        return "Cont{" +
                "nrCont='" + nrCont + '\'' +
                ", suma=" + suma +
                '}';
    }
}
