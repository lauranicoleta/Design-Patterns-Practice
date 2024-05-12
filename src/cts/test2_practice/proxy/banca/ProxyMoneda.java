package cts.test2_practice.proxy.banca;

public class ProxyMoneda implements CreareCredit{

    private CreareCredit credit;

    public ProxyMoneda() {
        this.credit = new Credit();
    }

    @Override
    public void creareCredit(String denumire, Cerere cerereCredit) {
        if(cerereCredit.getMoneda() == "RON"){
            credit.creareCredit(denumire, cerereCredit);
        }else {
            System.out.println("Banca nu ofera credite in acesta moneda.");
        }
    }
}
