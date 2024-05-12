package cts.s09.proxy.main;

import cts.s09.proxy.classes.*;

public class Main {
    public static void main(String[] args){
        Vanzare vanzare = new VanzareBilet("Meci1", 20);
        ProxyVarsta proxyVarsta = new ProxyVarsta(vanzare);
        ProxyVarsta.setareVarstaMinima(15);

        proxyVarsta.vanzare(new Persoana(10, "Carina", "F"));
        proxyVarsta.vanzare(new Persoana(20, "Iancu", "M"));

        ProxyGen proxyGen = new ProxyGen(vanzare);
        ProxyGen.setareGenAcceptat("F");
        proxyGen.vanzare(new Persoana(20, "Maria", "F"));
    }
}
