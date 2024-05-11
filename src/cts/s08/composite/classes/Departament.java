package cts.s08.composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbstracta{
    private List<StructuraAbstracta> structuri;
    private String directorDep;
    public Departament(String nume, String director) {
        super(nume);
        this.directorDep = director;
        this.structuri = new ArrayList<>();
    }

    @Override
    public String getNume() {
        return super.getNume();
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
        if(index > 0 && index<structuri.size()){
            return structuri.get(index);
        }else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void afiseazaDescriere(String indentare) {
        System.out.println(indentare + "Departamentul " + super.getNume() + " este condus de " +
                this.directorDep + " si are urmatoarea componenta: ");
        for(StructuraAbstracta sa : structuri){
            sa.afiseazaDescriere(indentare+"      ");
        }
    }
}
