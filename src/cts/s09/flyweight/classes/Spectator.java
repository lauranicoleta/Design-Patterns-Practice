package cts.s09.flyweight.classes;

public class Spectator implements Flyweight{
    private int inaltime;
    private int latime;

    public Spectator(int inaltime, int latime) {
        this.inaltime = inaltime;
        this.latime = latime;
    }

    @Override
    public void deseneaza(CaracteristiciSpectator caracteristici) {
        System.out.println(this + " " + caracteristici.toString());
    }

    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    @Override
    public String toString() {
        return "Spectator{" +
                "inaltime=" + inaltime +
                ", latime=" + latime +
                '}';
    }
}
