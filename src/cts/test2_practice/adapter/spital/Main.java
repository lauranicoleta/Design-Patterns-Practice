package cts.test2_practice.adapter.spital;

public class Main {
    public static void main(String[] args){
        CumparaMedicament medicamentFarmacie = new MedicamentFarmacie();
        medicamentFarmacie.cumpărăMedicament();

        CumparaMedicament medicamentSpital = new CumparaMedicamentSpital();
        medicamentSpital.cumpărăMedicament();
    }
}
