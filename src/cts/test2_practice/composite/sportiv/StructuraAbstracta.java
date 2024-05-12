package cts.test2_practice.composite.sportiv;

public abstract class StructuraAbstracta {
    private String denumire;

    public StructuraAbstracta(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
    public abstract void adaugaStructura(StructuraAbstracta sa);
    public abstract void stergeStructura(StructuraAbstracta sa);
    public abstract StructuraAbstracta getStructura(int index);
    public abstract void afiseazaDescrierea(String indentare);
}
