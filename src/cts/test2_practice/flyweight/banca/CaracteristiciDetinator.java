package cts.test2_practice.flyweight.banca;

public class CaracteristiciDetinator {
    private String nume;
    private String nrTel;

    public CaracteristiciDetinator(String nume, String nrTel) {
        this.nume = nume;
        this.nrTel = nrTel;
    }

    @Override
    public String toString() {
        return "CaracteristiciDetinator{" +
                "nume='" + nume + '\'' +
                ", nrTel='" + nrTel + '\'' +
                '}';
    }
}
