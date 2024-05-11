package cts.test2_practice.decorator.restaurant;

public class Main {
    public static void main(String[] args){
        Nota nota = new NotaDePlata(3, 500.89);
        nota.printeazaNota();

        Decorator notaCuMesaj = new NotaCuMesaj(nota);
        notaCuMesaj.printezaCuMesaj();
    }
}
