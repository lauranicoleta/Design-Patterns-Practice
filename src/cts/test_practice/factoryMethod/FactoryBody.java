package cts.test_practice.factoryMethod;

import cts.test_practice.simpleFactory.clase.CategorieMedicament;

public class FactoryBody implements IFactoryCategorieMedicament{
    @Override
    public CatogorieMedicament createCategorieMedicament(String denumire, double pret) {
        return new Body(denumire, pret);
    }
}
