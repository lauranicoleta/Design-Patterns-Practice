package cts.test2_practice.strategy.STB;

public class Main {
    public static void main(String[] args){
        String plataCardBancar = "prin card bancar.";
        String plataCardCalatorii = "prin card calatorii.";
        String plataSMS = "prin SMS.";

        Calator calator = new Calator(new PlataCardBancar());
        calator.plateste(plataCardBancar);

        calator.setStrategy(new PlataCardCalatorii());
        calator.plateste(plataCardCalatorii);

        calator.setStrategy(new PlataSMS());
        calator.plateste(plataSMS);
    }
}
