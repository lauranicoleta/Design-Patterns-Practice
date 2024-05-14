package cts.test2_practice.proxy.farmacie;

public class Main {
    public static void main(String[] args){
        ClientFar clientFar = new ClientFar("Ionela" , true);
        Achizitie vanzare = new Vanzare(20);
        ProxyAreReteta proxyAreReteta = new ProxyAreReteta(vanzare);
        proxyAreReteta.seRealizeazaAchizitia(clientFar);

        ProxyAreReteta.setareTrebuieReteta(false);
        proxyAreReteta.seRealizeazaAchizitia(clientFar);
    }
}
