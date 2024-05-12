package cts.test2_practice.composite.sportiv;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends StructuraAbstracta{
    private List<StructuraAbstracta> structuri;
    public Sectiune(String denumire) {
        super(denumire);
        this.structuri = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        structuri.add(sa);
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        structuri.remove(sa);
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        if(index > 0 && index < structuri.size()){
            return structuri.get(index);
        }else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void afiseazaDescrierea(String indentare) {
        System.out.println(indentare + "Sectiunea " + super.getDenumire() + " are urmatoarele: ");
        for (StructuraAbstracta sa: structuri){
             sa.afiseazaDescrierea(indentare + "      ");
        }
    }
}
