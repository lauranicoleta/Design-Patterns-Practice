package cts.test2_practice.facade.spital;

public class Main {
    public static void main(String[] args){
        Pacient pacient = new Pacient("Anaaa", "ok");
        Pacient pacient1 = new Pacient("Florin", "rea");

        InternarePacient internarePacient = new InternarePacient();
        internarePacient.interneazaPacient(pacient);
        internarePacient.interneazaPacient(pacient1);
    }
}
