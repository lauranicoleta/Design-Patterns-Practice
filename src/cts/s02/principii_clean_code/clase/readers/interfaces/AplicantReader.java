package cts.s02.principii_clean_code.clase.readers.interfaces;

import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    private String fileName;

    public AplicantReader(String fileName){
        this.fileName = fileName;
    }

    public void readAplicant(Scanner input, Aplicant aplicant){
        String nume = input.next();
        String prenume = (input.next()).toString();
        int varsta = Integer.valueOf(input.nextInt());
        int punctaj = Integer.valueOf(input.nextInt());
        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setNr_proiecte(nr, vect);
        aplicant.setPunctaj(punctaj);
    }
    public abstract List<Aplicant> read() throws FileNotFoundException;

}
