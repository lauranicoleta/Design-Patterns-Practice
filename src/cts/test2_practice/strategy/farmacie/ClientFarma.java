package cts.test2_practice.strategy.farmacie;

public class ClientFarma {
    private Strategy strategy;

    public ClientFarma(){
        this.strategy = new PlataCard();
    }
    public ClientFarma(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void plateste(String tipPlata){
        strategy.plateste(tipPlata);
    }
}
