package cts.test2_practice.flyweight.farmacie;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {
    private Map<Integer, Flyweight> retete;
    public FabricaFlyweight(){
        retete = new HashMap<>();
    }
    public Flyweight getReteta(int nrReteta, double suma){
        Flyweight flyweight = retete.get(nrReteta);
        if(flyweight == null){
            flyweight = new RetetaAchiztionata(nrReteta, suma);
            retete.put(nrReteta,flyweight);
        }
        return flyweight;
    }
}
