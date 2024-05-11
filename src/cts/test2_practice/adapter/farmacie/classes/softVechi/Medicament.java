package cts.test2_practice.adapter.farmacie.classes.softVechi;

public class Medicament {
    private String id;
    private double cantitate;

    public Medicament(){}

    public Medicament(String id, double cantitate) {
        this.id = id;
        this.cantitate = cantitate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCantitate() {
        return cantitate;
    }

    public void setCantitate(double cantitate) {
        this.cantitate = cantitate;
    }


    @Override
    public String toString() {
        return "Medicament{" +
                "id='" + id + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }
}
