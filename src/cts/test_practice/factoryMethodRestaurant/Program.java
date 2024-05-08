package cts.test_practice.factoryMethodRestaurant;

public class Program {
    public static void prelucrareSupa(IFactorySupa factorySupa, String denumire, double cantitate){
        Supa supa = factorySupa.createSupa(denumire, cantitate);
        supa.afisareDetalii();
    }
    public static void main(String[] args){
        prelucrareSupa(new FactorySupaDeLegume(), "Supa de legume ", 500);
    }
}
