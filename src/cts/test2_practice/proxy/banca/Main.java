package cts.test2_practice.proxy.banca;

public class Main {
    /*Banca ia hotărârea sa se realizeze credite doar în RON, deși în momentul de față oferă
posibilitatea creării de conturi în orice monedă. Să se realizeze un nivel intermediar pentru clasa
Credit, care să permită realizarea contului doar dacă se cere să fie în RON.
*/
    public static void main(String[] args){
        ProxyMoneda proxyMoneda = new ProxyMoneda();
        proxyMoneda.creareCredit("prima casa", new Cerere(999999,"RON"));
        proxyMoneda.creareCredit("prima casa", new Cerere(999999,"Rds"));
    }

}
