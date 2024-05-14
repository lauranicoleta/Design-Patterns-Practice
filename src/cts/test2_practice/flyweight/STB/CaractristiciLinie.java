package cts.test2_practice.flyweight.STB;

public class CaractristiciLinie {
    private int nrLinie;
    private String ultimaStatie;
    private String primaStatie;

    public CaractristiciLinie(int nrLinie, String ultimaStatie, String primaStatie) {
        this.nrLinie = nrLinie;
        this.ultimaStatie = ultimaStatie;
        this.primaStatie = primaStatie;
    }

    @Override
    public String toString() {
        return "CaractristiciLinie{" +
                "nrLinie=" + nrLinie +
                ", ultimaStatie='" + ultimaStatie + '\'' +
                ", primaStatie='" + primaStatie + '\'' +
                '}';
    }
}
