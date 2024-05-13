package cts.test2_practice.facade.spital;

public class Medic {
    private String name;

    public Medic(String name) {
        this.name = name;
    }
    public boolean confirmareMedic(Pacient pacient){
        return !pacient.getStare().equalsIgnoreCase("ok");
    }
}
