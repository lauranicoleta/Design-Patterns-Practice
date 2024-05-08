package cts.test_practice.factoryMethodRestaurant;

public class FactorySupaDeVita implements IFactorySupa{

    @Override
    public Supa createSupa(String denumire, double cantitate) {
        return new SupaDeVita(denumire, cantitate);
    }
}
