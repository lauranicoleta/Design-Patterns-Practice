package cts.test2_practice.composite.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends StructuraAbstracta{

    private List<StructuraAbstracta> structuri;
    public Sectiune(String nume) {
        super(nume);
        this.structuri = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        this.structuri.add(sa);
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        this.structuri.remove(sa);
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        if(index > 0 && index< structuri.size()){
            return structuri.get(index);
        }else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void descriere(String indentare) {
        System.out.println(indentare + super.getNume() + " contine: " );
        for(StructuraAbstracta sa : structuri) {
            sa.descriere(indentare + "      ");
        }
    }
}
