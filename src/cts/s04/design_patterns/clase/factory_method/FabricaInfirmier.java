package cts.s04.design_patterns.clase.factory_method;

import cts.s04.design_patterns.clase.Infirmier;
import cts.s04.design_patterns.clase.PersonalSpital;

public class FabricaInfirmier implements IFabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Infirmier(nume, salariu);
    }
}
