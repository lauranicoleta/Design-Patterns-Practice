package cts.s10.strategy.classes;

public class VerificatorPeluza implements Strategy{
    @Override
    public void verifica(String numeSpectator) {
        System.out.println("Se verifica bagajele si hainele purtate pentru spectatorul " + numeSpectator);
    }
}
