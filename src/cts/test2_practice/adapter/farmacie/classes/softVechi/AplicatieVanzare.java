package cts.test2_practice.adapter.farmacie.classes.softVechi;

public class AplicatieVanzare extends Farmacie implements SoftVanzareMedicament{
    private Medicament medicament;

    public AplicatieVanzare() {}

    @Override
    public void setareMedicament(String id) {
        this.medicament = super.getMedicament(id);
    }

    @Override
    public boolean verificareDisponibilitate(double numarDorit) {
        if(this.medicament != null){
            if(this.medicament.getCantitate() >= numarDorit){
                return true;
            }else {
                return false;
            }
        }
        else{
            System.out.println("Acest medicament nu exista!");
            return false;
        }
    }
}
