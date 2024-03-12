package cts.s04.design_patterns.clase.factory_method;

import cts.s04.design_patterns.clase.Asistent;
import cts.s04.design_patterns.clase.PersonalSpital;

public class FabricaAsistent implements IFabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}
