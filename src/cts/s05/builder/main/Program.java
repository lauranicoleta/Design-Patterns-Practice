package cts.s05.builder.main;

import cts.s04.design_patterns.clase.factory_method.FabricaAsistent;
import cts.s04.design_patterns.clase.factory_method.FabricaInfirmier;
import cts.s05.builder.clase.Pacient;
import cts.s05.builder.clase.PacientBuilder;

public class Program {
    public static void main(String[] args) {
        Pacient pacient = new PacientBuilder().setHalatDeBaie(true).setMicDeJun(true).setPatRabatabil(true).setPapuciDeCamera(false).build();
    }
}
