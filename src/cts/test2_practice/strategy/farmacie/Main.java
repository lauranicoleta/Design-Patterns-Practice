package cts.test2_practice.strategy.farmacie;

public class Main {
    public static void main(String[] args){
        ClientFarma clientFarma = new ClientFarma();
        clientFarma.plateste("card");
        clientFarma.setStrategy(new PlataCash());
        clientFarma.plateste("cash");
    }
}
