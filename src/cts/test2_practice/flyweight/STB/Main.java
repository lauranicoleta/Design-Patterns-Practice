package cts.test2_practice.flyweight.STB;

public class Main {
    public static void main(String[] args){
        FabricaFlyweight fabricaFlyweight = new FabricaFlyweight();
        CaractristiciLinie caractristiciLinie = new CaractristiciLinie(1, "Tudor Vladimirescu", "Poienaru");
        fabricaFlyweight.getAutobuz("Audi", 100).descrieLinie(caractristiciLinie);
        fabricaFlyweight.getAutobuz("Mercedes", 500).descrieLinie(caractristiciLinie);
    }
}
