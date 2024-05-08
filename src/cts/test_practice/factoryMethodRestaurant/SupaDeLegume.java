package cts.test_practice.factoryMethodRestaurant;

public class SupaDeLegume extends Supa{

    public SupaDeLegume(String denumire, double cantitate) {
        super(denumire, cantitate);
    }

    @Override
    public void afisareDetalii() {
        System.out.println(getDenumire() + " are cantitatea de " + getCantitate() + " grame.");
    }
}
