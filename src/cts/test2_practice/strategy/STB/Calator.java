package cts.test2_practice.strategy.STB;

public class Calator {
    private Strategy strategy;
    public Calator(){
        this.strategy = new PlataCardBancar();
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public Calator(Strategy strategy) {
        this.strategy = strategy;
    }
    public void plateste(String metodaDePlata){
        strategy.plateste(metodaDePlata);
    }
}
