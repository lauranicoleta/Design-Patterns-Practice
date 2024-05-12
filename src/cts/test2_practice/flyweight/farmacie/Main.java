package cts.test2_practice.flyweight.farmacie;

import cts.s09.flyweight.classes.Fabrica;

public class Main {
    public static void main(String[] args){
        FabricaFlyweight fabricaFlyweight = new FabricaFlyweight();
        CaracteristiciClient client1 = new CaracteristiciClient("Ana", 34);

        fabricaFlyweight.getReteta(1, 500).descrieClient(client1);
        fabricaFlyweight.getReteta(2,234).descrieClient(client1);

    }
}
