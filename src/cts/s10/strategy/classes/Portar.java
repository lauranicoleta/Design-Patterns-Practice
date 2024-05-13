package cts.s10.strategy.classes;

public class Portar {
    private Strategy strategy;

    public Portar() {
        this.strategy = new VerificatorPeluza();
    }

    public Portar(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void verificaSpectator(String numeSpectator){
        strategy.verifica(numeSpectator);
    }
}
