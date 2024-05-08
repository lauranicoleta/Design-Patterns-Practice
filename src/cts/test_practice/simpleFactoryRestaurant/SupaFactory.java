package cts.test_practice.simpleFactoryRestaurant;

public class SupaFactory {

    public Supa createSupa(TipSupa tipSupa, String denumire, double cantitate){
        switch (tipSupa){
            case SUPADEVITA:
                SupaDeVita supaDeVita = new SupaDeVita(denumire, cantitate);
                return supaDeVita;
            case SUPADECIUPRECI:
                SupaDeCiuperci supaDeCiuperci = new SupaDeCiuperci(denumire, cantitate);
                return supaDeCiuperci;
        }
        return null;
    }


}
