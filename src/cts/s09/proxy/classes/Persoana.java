package cts.s09.proxy.classes;

public class Persoana {
    private int varsta;
    private String nume;
    private String gen;

    public Persoana(int varsta, String nume, String gen) {
        this.varsta = varsta;
        this.nume = nume;
        this.gen = gen;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "varsta=" + varsta +
                ", nume='" + nume + '\'' +
                ", gen='" + gen + '\'' +
                '}';
    }
}
