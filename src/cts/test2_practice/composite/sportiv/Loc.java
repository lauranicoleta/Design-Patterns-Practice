package cts.test2_practice.composite.sportiv;

public class Loc extends StructuraAbstracta{
    private int nrLoc;

    public Loc(String denumire, int nrLoc) {
        super(denumire);
        this.nrLoc = nrLoc;
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaDescrierea(String indentare) {
        System.out.println(indentare + " Locul " + this.nrLoc);
    }
}
