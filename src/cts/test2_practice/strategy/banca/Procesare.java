package cts.test2_practice.strategy.banca;

public class Procesare {
    private Strategy strategy;

    public Procesare(){
        strategy = new PersoaneFizice();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Procesare(Strategy strategy) {
        this.strategy = strategy;
    }
    public void proceseazaDoc(String tipClient){
        strategy.procesareDocumente(tipClient);
    }
}
