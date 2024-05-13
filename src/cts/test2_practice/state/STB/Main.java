package cts.test2_practice.state.STB;

public class Main {
    public static void main(String[] args){
        Autobuz autobuz = new Autobuz("N334");
        autobuz.pleacaInCursa();
        autobuz.pleacaInCursa();
        autobuz.laCapatDeLinie();
        autobuz.esteLaReparat();
        autobuz.aIesitDeLaReparat();
    }
}
