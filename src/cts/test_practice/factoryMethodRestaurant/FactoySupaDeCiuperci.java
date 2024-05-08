package cts.test_practice.factoryMethodRestaurant;

public class FactoySupaDeCiuperci implements IFactorySupa{
    @Override
    public Supa createSupa(String denumire, double cantitate) {
        return new SupaDeCiuperci(denumire, cantitate);
    }
}
