package cts.test2_practice.decorator.sportiv;

public class Main {
    public static void main(String[] args){
        Bilet biletNormal = new BiletNormal("Ioana");
        biletNormal.printeazaBilet();

        Decorator biletCuMesaj = new BiletCuMesaj(biletNormal);
        biletCuMesaj.printeazaBiletCuMesaj();
    }
}
