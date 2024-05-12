package cts.test2_practice.proxy.STB;

public class ProxyNrPersoane implements Oprire{
    private Oprire oprire;
    private static int nrMinimDePersoane = 0;

    public ProxyNrPersoane(Oprire oprire) {
        this.oprire = oprire;
    }
    public static void setareNrMinimPersoane(int nr){
        ProxyNrPersoane.nrMinimDePersoane = nr;
    }

    @Override
    public void oprire(Autobuz autobuz) {
        if(autobuz.getNrPersoane() >= nrMinimDePersoane){
            oprire.oprire(autobuz);
        }else{
            System.out.println(autobuz + "se retrage la autogara deoarece nu are nr. minim de calatori.");
        }
    }
}
