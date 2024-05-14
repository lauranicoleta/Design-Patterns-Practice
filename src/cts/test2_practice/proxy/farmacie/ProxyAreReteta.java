package cts.test2_practice.proxy.farmacie;

public class ProxyAreReteta implements Achizitie{
    private Achizitie achizitie;
    private static boolean areReteta = true;

    public ProxyAreReteta(Achizitie achizitie) {
        this.achizitie = achizitie;
    }
    public static void setareTrebuieReteta(boolean areReteta){
        ProxyAreReteta.areReteta = areReteta;
    }

    @Override
    public void seRealizeazaAchizitia(ClientFar clientFar) {
        if(clientFar.isAreRetata() == ProxyAreReteta.areReteta){
            achizitie.seRealizeazaAchizitia(clientFar);
        }else{
            System.out.println("Nu se poate realiza achizitia deoarece clientul nu are reteta!");
        }
    }
}
