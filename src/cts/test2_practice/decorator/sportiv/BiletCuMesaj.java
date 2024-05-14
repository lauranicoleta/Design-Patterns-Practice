package cts.test2_practice.decorator.sportiv;


public class BiletCuMesaj extends Decorator{
    public BiletCuMesaj(Bilet biletNormal) {
        super(biletNormal);
    }
    @Override
    public void printeazaBiletCuMesaj() {
        super.printeazaBilet();
        System.out.println("Hai echipa locala!");
    }
}
