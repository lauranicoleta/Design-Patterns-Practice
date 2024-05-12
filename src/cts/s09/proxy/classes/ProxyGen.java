package cts.s09.proxy.classes;

public class ProxyGen implements Vanzare{
    private Vanzare vanzare;
    private static String genAcceptat = "F";
    public ProxyGen(Vanzare vanzare){
        this.vanzare = vanzare;
    }
    public static void setareGenAcceptat(String gen){
        ProxyGen.genAcceptat = gen;
    }

    @Override
    public void vanzare(Persoana persoana) {
        System.out.println(vanzare.toString() + " gen acceptat: " + genAcceptat + "\n");
        if(persoana.getGen() == genAcceptat){
            vanzare.vanzare(persoana);
        }else{
            System.out.println("Persoana nu indeplineste conditiile pentru a participa la acest meci.");
        }
    }
}
