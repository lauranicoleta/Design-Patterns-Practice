package cts.s09.flyweight.main;

import cts.s09.flyweight.classes.CaracteristiciSpectator;
import cts.s09.flyweight.classes.Fabrica;

public class Main {
    public static void main(String[] args){
        Fabrica fabrica = new Fabrica();
        CaracteristiciSpectator carSpec1 = new CaracteristiciSpectator(10,15,"rosu");
        CaracteristiciSpectator carSpec2 = new CaracteristiciSpectator(12,13,"verde");
        CaracteristiciSpectator carSpec3 = new CaracteristiciSpectator(17,10,"alb");

        fabrica.getSpectator(10, 12).deseneaza(carSpec1);
        fabrica.getSpectator(14,18).deseneaza(carSpec2);
        fabrica.getSpectator(13,20).deseneaza(carSpec3);

    }
}
