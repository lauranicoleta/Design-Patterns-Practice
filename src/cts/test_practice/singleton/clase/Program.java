package cts.test_practice.singleton.clase;


public class Program {
    public static void main(String[] args) {

        ConexiuneBazaDeDate conexiuneBazaDeDate = ConexiuneBazaDeDate.getInstance("denum1");
        System.out.println(conexiuneBazaDeDate.toString());


    }
}
