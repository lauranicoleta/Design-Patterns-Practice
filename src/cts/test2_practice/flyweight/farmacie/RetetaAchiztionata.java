package cts.test2_practice.flyweight.farmacie;

public class RetetaAchiztionata implements Flyweight{
    private int nrReteta;
    private double suma;

    public RetetaAchiztionata(int nrReteta, double suma) {
        this.nrReteta = nrReteta;
        this.suma = suma;
    }

    @Override
    public void descrieClient(CaracteristiciClient caracteristiciClient) {
        System.out.println(this + " " + caracteristiciClient);
    }

    @Override
    public String toString() {
        return "RetetaAchiztionata{" +
                "nrReteta=" + nrReteta +
                ", suma=" + suma +
                '}';
    }
}
