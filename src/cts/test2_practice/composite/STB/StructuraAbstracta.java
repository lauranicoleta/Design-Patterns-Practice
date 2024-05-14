package cts.test2_practice.composite.STB;

import java.util.ArrayList;
import java.util.List;

public abstract class StructuraAbstracta {
    private String denumire;

    public StructuraAbstracta(String denumire) {
        this.denumire = denumire;
    }
    public abstract void adaugaStructura(StructuraAbstracta sa);
    public abstract void stergeStructura(StructuraAbstracta sa);
    public abstract StructuraAbstracta getStructura(int index);
    public abstract void afisareStructura(String indentare);
}
