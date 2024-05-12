package cts.s09.proxy.classes;

public class ProxyVarsta implements Vanzare{
    private Vanzare vanzare;
    private static int varstaMinima = 14;

    public ProxyVarsta(Vanzare vanzare) {
        this.vanzare = vanzare;
    }
    public static void setareVarstaMinima(int varsta){
        ProxyVarsta.varstaMinima = varsta;
    }

    @Override
    public void vanzare(Persoana persoana) {
        System.out.println(vanzare.toString() + " varsta minima: " + varstaMinima + "\n");
        if(persoana.getVarsta() >= varstaMinima){
            vanzare.vanzare(persoana);
        }else{
            System.out.println("Persoana nu are varsta minima pentru a participa la acest meci.");
        }
    }
}
