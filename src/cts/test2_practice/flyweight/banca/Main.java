package cts.test2_practice.flyweight.banca;

public class Main {
    public static void main(String[] args){
        FabricaFlyweight fabricaFlyweight = new FabricaFlyweight();
        CaracteristiciDetinator det1= new CaracteristiciDetinator("Ionel", "0929492");
        CaracteristiciDetinator det2 = new CaracteristiciDetinator("Alina", "0289993");

        CaracteristiciBanca ban1 = new CaracteristiciBanca("Alpha", "bucuresti sector 5");
        CaracteristiciBanca ban2 = new CaracteristiciBanca("transilvania", "Iasi");

        fabricaFlyweight.getCont("1", 56663.69).memoreazaBanca(ban1);
        fabricaFlyweight.getCont("1", 56663.69).memoreazaDetinator(det1);

        fabricaFlyweight.getCont("2", 900).memoreazaBanca(ban2);
        fabricaFlyweight.getCont("2", 900).memoreazaDetinator(det2);

        fabricaFlyweight.getCont("3", 3566).memoreazaBanca(ban1);

    }
}
