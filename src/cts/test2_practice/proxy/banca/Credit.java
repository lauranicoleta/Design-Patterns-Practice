package cts.test2_practice.proxy.banca;

public class Credit implements CreareCredit{
    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    private String denumire;
    private String moneda;
    private double suma;

    public Credit(){

    }
    public Credit(String denumire, String moneda, double suma) {
        this.denumire = denumire;
        this.moneda = moneda;
        this.suma = suma;
    }

    @Override
    public void creareCredit(String denumire, Cerere cerereCredit) {
        Credit creditNou = new Credit(denumire, cerereCredit.getMoneda(), cerereCredit.getSuma());
        System.out.println(creditNou + " a fost creat cu succes!");
    }

    @Override
    public String toString() {
        return "Credit{" +
                "denumire='" + denumire + '\'' +
                ", moneda='" + moneda + '\'' +
                ", suma=" + suma +
                '}';
    }
}
