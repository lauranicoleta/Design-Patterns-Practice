package cts.test2_practice.adapter.farmacie.classes.softVechi;

public interface SoftVanzareMedicament {
    void setareMedicament(String id);
    boolean verificareDisponibilitate(double numarDorit);
    void adaugaMedicament(Medicament medicament);
}
