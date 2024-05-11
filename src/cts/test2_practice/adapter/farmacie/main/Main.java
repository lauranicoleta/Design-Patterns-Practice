package cts.test2_practice.adapter.farmacie.main;

import cts.test2_practice.adapter.farmacie.classes.softVechi.*;

public class Main {
    public static void main(String[] args){
        SoftVanzareMedicament vanzareMedicament = new AplicatieVanzare();
        vanzareMedicament.adaugaMedicament(new Medicament("ss1234", 2));
        vanzareMedicament.adaugaMedicament(new Medicament("dd234", 3));
        vanzareMedicament.adaugaMedicament(new Medicament("mm23", 1));

        vanzareMedicament.setareMedicament("mm23");
       // System.out.println(vanzareMedicament.getMedicament().toString() + vanzareMedicament.getMedicament().getCantitate());
        System.out.println(vanzareMedicament.verificareDisponibilitate(1));
        vanzareMedicament.setareMedicament("ss1234");
      //  System.out.println(vanzareMedicament.getMedicament().toString());
        boolean rezultat2 = vanzareMedicament.verificareDisponibilitate(100);
        System.out.println(rezultat2);

        SoftVanzareMedicament vanzareMedicamentGestiune = new AdapterAplicatieGestiunelaAplicatieVanzare();
        vanzareMedicamentGestiune.adaugaMedicament(new Medicament("556", 6));
        vanzareMedicamentGestiune.setareMedicament("556");
        System.out.println(vanzareMedicamentGestiune.verificareDisponibilitate(3));
    }
}
