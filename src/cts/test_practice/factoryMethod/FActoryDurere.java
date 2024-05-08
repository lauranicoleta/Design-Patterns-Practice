package cts.test_practice.factoryMethod;

import cts.s04.design_patterns.clase.factory_method.IFabricaPersonal;
import cts.test_practice.simpleFactory.clase.CategorieMedicament;

public class FActoryDurere implements IFactoryCategorieMedicament {

    @Override
    public CatogorieMedicament createCategorieMedicament(String denumire, double pret) {
        return new Durere(denumire, pret);
    }
}
