package cts.test_practice.builder;

public class Program {
    public static void  main(String[] args){
        Pacient p = new PacientBuilder().setMicDeJun(true).setPatRabatabil(false).build();
        System.out.println(p.toString());
    }
}
