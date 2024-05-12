package cts.test2_practice.flyweight.banca;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {
    private Map<String, Flyweight> conturi;
    public FabricaFlyweight(){
        this.conturi = new HashMap<>();
    }

    public Flyweight getCont(String nrCont, double suma){
        Flyweight flyweight = conturi.get(nrCont);
        if(flyweight == null){
            flyweight = new Cont(nrCont, suma);
            conturi.put(nrCont, flyweight);
        }
        return flyweight;
    }

}
