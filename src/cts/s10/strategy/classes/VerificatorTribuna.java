package cts.s10.strategy.classes;

public class VerificatorTribuna implements Strategy{
    @Override
    public void verifica(String numeSpectator) {
        System.out.println("Se verifica doar bagajele pentru spectatorul " + numeSpectator);
    }
}
