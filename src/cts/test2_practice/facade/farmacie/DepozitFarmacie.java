package cts.test2_practice.facade.farmacie;

public class DepozitFarmacie {
    private int medicamenteDisponibile;

    public DepozitFarmacie(int medicamenteDisponibile) {
        this.medicamenteDisponibile = medicamenteDisponibile;
    }

    public int getMedicamenteDisponibile() {
        return medicamenteDisponibile;
    }

    @Override
    public String toString() {
        return "DepozitFarmacie{" +
                "medicamenteDisponibile=" + medicamenteDisponibile +
                '}';
    }
}
