package cts.test2_practice.adapter.farmacie.classes.softNou;

import cts.test2_practice.adapter.farmacie.classes.softVechi.Farmacie;
import cts.test2_practice.adapter.farmacie.classes.softVechi.Medicament;

import java.util.ArrayList;

public class AplicatieGestiuneStoc extends Farmacie{
    Medicament medicament;
    public Medicament getMedicament() {
        return medicament;
    }

    public boolean verificăStocPentruMedicament(String id, double numarDorit){
        this.medicament = super.getMedicament(id);
        if(this.medicament.getCantitate() >= numarDorit){
            return true;
        }else{
            return false;
        }
    }
}
