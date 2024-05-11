package cts.test2_practice.decorator.banca;



public class Main {
    public static void main(String[] args){
       PlataCard plata = new Plata(633.99);
       plata.plataNormala();
       Decorator plataContactLess = new PlataContactLess(plata);
       plataContactLess.plataContactLess();
    }
}
