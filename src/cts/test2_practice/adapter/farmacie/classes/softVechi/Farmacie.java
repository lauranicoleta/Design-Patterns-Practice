package cts.test2_practice.adapter.farmacie.classes.softVechi;

import java.util.ArrayList;
import java.util.List;

public class Farmacie{
    private List<Medicament> farmacie;
    public Farmacie(){
        this.farmacie = new ArrayList<>();
    }
    public Farmacie(List<Medicament> farmacie) {
        this.farmacie = farmacie;
    }
    public List<Medicament> getFarmacie() {
        return farmacie;
    }

    public void adaugaMedicament(Medicament medicament){
        farmacie.add(medicament);
    }

    protected Medicament getMedicament(String id){
        for(Medicament med : farmacie){
            if(med.getId() == id){
                return med;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Farmacie{" +
                "farmacie=" + farmacie +
                '}';
    }
}
