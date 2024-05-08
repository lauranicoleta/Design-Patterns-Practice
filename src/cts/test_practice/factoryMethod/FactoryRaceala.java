package cts.test_practice.factoryMethod;

import cts.test_practice.simpleFactory.clase.CategorieMedicament;

public class FactoryRaceala implements IFactoryCategorieMedicament{
    @Override
    public CatogorieMedicament createCategorieMedicament(String denumire, double pret) {
        return new Raceala(denumire, pret);
    }
}
