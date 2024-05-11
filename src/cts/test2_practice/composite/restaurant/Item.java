package cts.test2_practice.composite.restaurant;

public class Item extends StructuraAbstracta{

    public Item(String nume) {
        super(nume);
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
    public void descriere(String indentare) {
        System.out.println(indentare + super.getNume());
    }
}
