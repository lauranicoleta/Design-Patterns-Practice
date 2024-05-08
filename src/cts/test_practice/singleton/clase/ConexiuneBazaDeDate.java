package cts.test_practice.singleton.clase;

public class ConexiuneBazaDeDate {
    private String denumire;

    private static ConexiuneBazaDeDate instance;

    private ConexiuneBazaDeDate(String denumire){
        this.denumire = denumire;
    }

    public static synchronized ConexiuneBazaDeDate getInstance(String denumire){
        if(instance == null){
             instance = new ConexiuneBazaDeDate(denumire);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "ConexiuneBazaDeDate{" +
                "denumire='" + denumire + '\'' +
                '}';
    }
}
