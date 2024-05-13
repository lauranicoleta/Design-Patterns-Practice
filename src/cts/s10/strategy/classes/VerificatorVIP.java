package cts.s10.strategy.classes;

public class VerificatorVIP implements Strategy{
    @Override
    public void verifica(String numeSpectator) {
        System.out.println("Se verifica doar biletul spectatorului " + numeSpectator);
    }
}
