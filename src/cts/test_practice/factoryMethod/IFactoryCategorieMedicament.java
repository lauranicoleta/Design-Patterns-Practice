package cts.test_practice.factoryMethod;

import cts.test_practice.simpleFactory.clase.CategorieMedicament;

public interface IFactoryCategorieMedicament {
    public CatogorieMedicament createCategorieMedicament(String denumire, double pret);
}
