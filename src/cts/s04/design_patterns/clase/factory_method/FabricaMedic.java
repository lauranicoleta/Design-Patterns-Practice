package cts.s04.design_patterns.clase.factory_method;

import cts.s04.design_patterns.clase.Medic;
import cts.s04.design_patterns.clase.PersonalSpital;

public class FabricaMedic implements IFabricaPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}
