package cts.test_practice.factoryMethodRestaurant;

public class SupaDeVita extends Supa{
    public SupaDeVita(String denumire, double cantitate) {
        super(denumire, cantitate);
    }

    @Override
    public void afisareDetalii() {
        System.out.println(getDenumire() + " are cantitatea de " + getCantitate() + " grame.");
    }
}
