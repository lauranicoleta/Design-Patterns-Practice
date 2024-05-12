package cts.s09.flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map<String, Flyweight> spectatori;
    public Fabrica(){
        this.spectatori = new HashMap<>();
    }
    public Flyweight getSpectator(int inaltime, int latime){
        Flyweight flyweight = spectatori.get(inaltime + " " + latime);
        if(flyweight == null){
            flyweight = new Spectator(inaltime, latime);
            spectatori.put(inaltime + " " + latime, flyweight);
        }
        return flyweight;
    }
}
