package cts.test_practice.prototypeRestaurant;

public class Program {
    public static void main(String[] args){

        ContClientAbstract contClient = new ContClient("Ioana" , "076399825");
        ContClientAbstract cont2 = contClient.clone();
        System.out.println(cont2.toString());


    }
}
