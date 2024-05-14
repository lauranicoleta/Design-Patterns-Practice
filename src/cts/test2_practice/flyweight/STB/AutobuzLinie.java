package cts.test2_practice.flyweight.STB;

public class AutobuzLinie implements Flyweight {
    private String modelAutobuz;
    private int nrLocuri;

    @Override
    public void descrieLinie(CaractristiciLinie caracteristiciLinie) {
        System.out.println(this + caracteristiciLinie.toString());
    }

    public String getModelAutobuz() {
        return modelAutobuz;
    }

    public void setModelAutobuz(String modelAutobuz) {
        this.modelAutobuz = modelAutobuz;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public AutobuzLinie(String modelAutobuz, int nrLocuri) {
        this.modelAutobuz = modelAutobuz;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "AutobuzLinie{" +
                "modelAutobuz='" + modelAutobuz + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
