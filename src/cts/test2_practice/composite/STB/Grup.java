package cts.test2_practice.composite.STB;

import java.util.ArrayList;
import java.util.List;

public class Grup extends StructuraAbstracta {
    private List<StructuraAbstracta> structuri;

    public Grup(String denumire) {
        super(denumire);
        this.structuri = new ArrayList<>();
    }

    public void adaugaStructura(StructuraAbstracta sa){
        if(!structuri.contains(sa)){
            structuri.add(sa);
        }else {
            throw new IllegalArgumentException();
        }
    }
    public void stergeStructura(StructuraAbstracta sa){
        if(structuri.contains(sa)){
            structuri.remove(sa);
        }else{
            throw new IllegalArgumentException();
        }
    }
    public StructuraAbstracta getStructura(int index){
        if(index > 0 && index < structuri.size()){
            return structuri.get(index);
        }else {
            throw new IllegalArgumentException();
        }
    }
    @Override
    public void afisareStructura(String indentare) {
        System.out.println(indentare + " Aceasta flota are urmatoarele grupuri: \n");
        for (StructuraAbstracta sa : structuri){
            sa.afisareStructura(indentare + "       ");
        }
    }
}
