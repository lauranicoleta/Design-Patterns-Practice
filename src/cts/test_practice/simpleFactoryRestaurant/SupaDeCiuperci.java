package cts.test_practice.simpleFactoryRestaurant;

public class SupaDeCiuperci extends Supa{

    public SupaDeCiuperci(String denumire, double cantitate) {
        super(denumire, cantitate);
    }
    @Override
    public void afisareDetalii() {
        System.out.println(getDenumire() + " are cantitatea de " + getCantitate() + " grame.");
    }
}
