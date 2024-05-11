package cts.test2_practice.adapter.spital;

public class CumparaMedicamentSpital implements CumparaMedicament{
    MedicamentSpital medicamentSpital;
    public CumparaMedicamentSpital(){
        this.medicamentSpital = new MedicamentSpital();
    }
    @Override
    public void cumpărăMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
