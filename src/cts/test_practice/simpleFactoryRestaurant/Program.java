package cts.test_practice.simpleFactoryRestaurant;

public class Program {
    public static void main(String[] args){
        SupaFactory supa = new SupaFactory();
        Supa supaDeCiuperci = supa.createSupa(TipSupa.SUPADECIUPRECI, "Supa de ciuperci", 500);
        supaDeCiuperci.afisareDetalii();
    }
}
