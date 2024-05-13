package cts.test2_practice.strategy.banca;

public class PersoaneJuridice implements Strategy{
    @Override
    public void procesareDocumente(String tipClient) {
        System.out.println("Pentru " + tipClient + " se solicita acte infiintare firma si dovada inregistrarii.");
    }
}
