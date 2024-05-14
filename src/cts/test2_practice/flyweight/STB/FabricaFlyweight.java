package cts.test2_practice.flyweight.STB;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {
    private Map<String, Flyweight> autobuze;

    public FabricaFlyweight() {
        this.autobuze = new HashMap<>();
    }
    public Flyweight getAutobuz(String modelAutobuz, int nrLocuri){
        Flyweight flyweight = autobuze.get(modelAutobuz);
        if(flyweight == null){
            flyweight = new AutobuzLinie(modelAutobuz, nrLocuri);
            autobuze.put(modelAutobuz, flyweight);
        }
        return flyweight;
    }
}
