package cts.test_practice.factoryMethodRestaurant;

public class FactorySupaDeLegume implements IFactorySupa{
    @Override
    public Supa createSupa(String denumire, double cantitate) {
        return new SupaDeLegume(denumire, cantitate);
    }
}
