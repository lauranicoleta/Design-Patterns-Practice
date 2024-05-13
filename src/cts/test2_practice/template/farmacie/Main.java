package cts.test2_practice.template.farmacie;

import cts.test2_practice.template.farmacie.classes.Farmacie;
import cts.test2_practice.template.farmacie.classes.Reteta;
import cts.test2_practice.template.farmacie.classes.Template;

public class Main {
    public static void main(String[] args){
        Reteta reteta = new Reteta(10);
        Template farmacie = new Farmacie(15, 0);

        farmacie.achizitie(reteta);

    }
}
