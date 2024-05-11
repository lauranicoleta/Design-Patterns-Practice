package cts.test2_practice.adapter.farmacie.classes.softVechi;

import cts.test2_practice.adapter.farmacie.classes.softNou.AplicatieGestiuneStoc;

public class AdapterAplicatieGestiunelaAplicatieVanzare extends AplicatieGestiuneStoc implements SoftVanzareMedicament {

    Medicament medicament;
    public AdapterAplicatieGestiunelaAplicatieVanzare(){
        this.medicament = new Medicament();
    }
    @Override
    public void setareMedicament(String id) {
        this.medicament = super.getMedicament(id);
    }

    @Override
    public boolean verificareDisponibilitate(double numarDorit) {

        return super.verificăStocPentruMedicament(this.medicament.getId(), numarDorit);
    }
}
