package cts.test_practice.factoryMethod;

import cts.test_practice.simpleFactory.clase.CategorieMedicament;

public class Durere extends CatogorieMedicament{
    public Durere(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Med. din categoria durere " + super.toString());
    }
}
