package cts.test_practice.prototype;

public class Program {
    public static void main(String[] args){
        PersoanaAbstracta p = new Persoana(22.5, 10.36, 10.55);
        PersoanaAbstracta p2= p.clone();
        System.out.println(p2.toString());
    }
}
