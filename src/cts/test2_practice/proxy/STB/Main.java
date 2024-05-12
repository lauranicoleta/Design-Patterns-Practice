package cts.test2_practice.proxy.STB;

public class Main {
    public static void main(String[] args){
        Oprire autobuz = new Autobuz("n118", 1);
        ProxyNrPersoane.setareNrMinimPersoane(1);
        ProxyNrPersoane proxyNrPersoane = new ProxyNrPersoane(autobuz);
        proxyNrPersoane.oprire((Autobuz) autobuz);
    }
}
