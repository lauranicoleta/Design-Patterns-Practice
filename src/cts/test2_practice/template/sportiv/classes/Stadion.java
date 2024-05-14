package cts.test2_practice.template.sportiv.classes;

public class Stadion extends Template{
    @Override
    protected void seAseazaLaCoada() {
        System.out.println("Spectatorii s-au asezat la coada!");
    }

    @Override
    protected void sePrezintaBiletul() {
        System.out.println("Spectatorii au prezentat biletul!");
    }

    @Override
    protected void seIntraPeStadion() {
        System.out.println("Spectatorii au intrat pe stadion!");
    }

    @Override
    protected void seOcupaLocul() {
        System.out.println("Spectatorii s-au asezat pe locuri!");
    }
}
