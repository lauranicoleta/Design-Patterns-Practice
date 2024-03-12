package cts.s04.design_patterns.main;

import cts.s04.design_patterns.clase.PersonalSpital;
import cts.s04.design_patterns.clase.factory_method.FabricaAsistent;
import cts.s04.design_patterns.clase.factory_method.FabricaInfirmier;
import cts.s04.design_patterns.clase.factory_method.FabricaMedic;
import cts.s04.design_patterns.clase.factory_method.IFabricaPersonal;
import cts.s04.design_patterns.clase.simple_factory.FabricaPersonal;
import cts.s04.design_patterns.clase.simple_factory.TipPersonal;

public class Program {
    public static void prelucrarePersoanl(IFabricaPersonal fabricaPersonal, String nume, int salariu){
       PersonalSpital personal = fabricaPersonal.createPersonal(nume, salariu);
       personal.afisareDetalii();
    }
    public static void main(String[] args) {

//        FabricaPersonal fabricaPersonal = new FabricaPersonal();
//        PersonalSpital medic = fabricaPersonal.createPersonal(TipPersonal.MEDIC, "Ioan", 20000);
//        PersonalSpital asistent = fabricaPersonal.createPersonal(TipPersonal.ASISTENT, "Alexandra", 1500);
//        medic.afisareDetalii();
//        asistent.afisareDetalii();

//        IFabricaPersonal fabricaMedic = new FabricaMedic();
//        IFabricaPersonal fabricaAsistent = new FabricaAsistent();
//        PersonalSpital medic = fabricaMedic.createPersonal("Ioan", 4283);
//        medic.afisareDetalii();

        prelucrarePersoanl(new FabricaAsistent(), "Ioana", 37437);
        prelucrarePersoanl(new FabricaInfirmier(), "Alex", 74528);
    }
}
