package cts.s10.strategy.main;

import cts.s10.strategy.classes.Portar;
import cts.s10.strategy.classes.VerificatorPeluza;
import cts.s10.strategy.classes.VerificatorTribuna;
import cts.s10.strategy.classes.VerificatorVIP;

public class Main {
    public static void main(String[] args){
        String supVIP = "Ioan";
        String supTribuna = "Ana";
        String supPeluza = "Calina";

        Portar portar = new Portar(new VerificatorVIP());
        portar.verificaSpectator(supVIP);

        portar.setStrategy(new VerificatorPeluza());
        portar.verificaSpectator(supPeluza);

        portar.setStrategy(new VerificatorTribuna());
        portar.verificaSpectator(supTribuna);
    }
}
