package cts.test2_practice.proxy.banca;

public class Cerere {
    private double suma;
    private String moneda;

    public Cerere(double suma, String moneda) {
        this.suma = suma;
        this.moneda = moneda;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return "Cerere{" +
                "suma=" + suma +
                ", moneda='" + moneda + '\'' +
                '}';
    }
}
