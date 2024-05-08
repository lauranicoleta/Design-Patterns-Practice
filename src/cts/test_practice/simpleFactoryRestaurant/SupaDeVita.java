package cts.test_practice.simpleFactoryRestaurant;

public class SupaDeVita extends Supa{
    public SupaDeVita(String denumire, double cantitate) {

        super(denumire, cantitate);
    }
    @Override
    public void afisareDetalii() {
        System.out.println(getDenumire() + " are cantitatea de " + getCantitate() + " grame.");
    }
}
