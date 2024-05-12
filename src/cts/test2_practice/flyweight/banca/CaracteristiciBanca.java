package cts.test2_practice.flyweight.banca;

public class CaracteristiciBanca {
    private String nume;
    private String sucursala;

    public CaracteristiciBanca(String nume, String sucursala) {
        this.nume = nume;
        this.sucursala = sucursala;
    }

    @Override
    public String toString() {
        return "CaracteristiciBanca{" +
                "nume='" + nume + '\'' +
                ", sucursala='" + sucursala + '\'' +
                '}';
    }
}
