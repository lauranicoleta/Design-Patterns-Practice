package cts.test2_practice.flyweight.farmacie;

public class CaracteristiciClient {
    private String nume;
    private int nrAsigurare;

    public CaracteristiciClient(String nume, int nrAsigurare) {
        this.nume = nume;
        this.nrAsigurare = nrAsigurare;
    }

    @Override
    public String toString() {
        return "CaracteristiciClient{" +
                "nume='" + nume + '\'' +
                ", nrAsigurare=" + nrAsigurare +
                '}';
    }
}
