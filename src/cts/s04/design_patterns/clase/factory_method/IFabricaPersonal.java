package cts.s04.design_patterns.clase.factory_method;

import cts.s04.design_patterns.clase.PersonalSpital;

public interface IFabricaPersonal {
    public PersonalSpital createPersonal(String nume, int salariu);
}
