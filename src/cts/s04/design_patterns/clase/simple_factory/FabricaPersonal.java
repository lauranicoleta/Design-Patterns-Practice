package cts.s04.design_patterns.clase.simple_factory;

import cts.s04.design_patterns.clase.*;

public class FabricaPersonal {
    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume, int salariu) {
        switch(tipPersonal){
            case MEDIC:
                Medic medic = new Medic(nume, salariu);
                return medic;
            case ASISTENT:
                Asistent asistent = new Asistent(nume, salariu);
                return asistent;
            case BRANCARDIER:
                Brancardier brancardier = new Brancardier(nume, salariu);
                return brancardier;
            case INFIRMIER:
                Infirmier infirmier = new Infirmier(nume, salariu);
                return infirmier;
        }
        return null;
    }
}
