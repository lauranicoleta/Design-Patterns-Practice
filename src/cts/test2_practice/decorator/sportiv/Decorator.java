package cts.test2_practice.decorator.sportiv;

public abstract class Decorator implements Bilet {
    protected Bilet biletNormal;

    public Decorator(Bilet biletNormal) {
        this.biletNormal = biletNormal;
    }

    @Override
    public void printeazaBilet() {
        biletNormal.printeazaBilet();
    }
    public abstract void printeazaBiletCuMesaj();
}
