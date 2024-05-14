package cts.test2_practice.strategy.farmacie;

public class PlataCash implements Strategy {
    @Override
    public void plateste(String tipPlata) {
        System.out.println("Clientul a utilizat plata " + tipPlata);
    }
}
