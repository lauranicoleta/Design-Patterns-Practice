package cts.test2_practice.facade.sportiv;

import java.util.List;

public class PersoaneCautateDePolitie {
    private List<String> seriiCuPersoaneCautateDePolitie;

    public PersoaneCautateDePolitie(List<String> seriiCuPersoaneCautateDePolitie) {
        this.seriiCuPersoaneCautateDePolitie = seriiCuPersoaneCautateDePolitie;
    }
    public boolean persoanaEsteCautata(String serieBuletin){
        if(seriiCuPersoaneCautateDePolitie.contains(serieBuletin)){
            return true;
        }else {
            return false;
        }
    }
}
