package cts.s02.principii_clean_code.clase.readers.classes;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;
import cts.s02.principii_clean_code.clase.readers.interfaces.AplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReder extends AplicantReader {
    public StudentReder(String fileName){
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner input = new Scanner(new File(getFileName()));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student aplicant = new Student();
            super.readAplicant(input, aplicant);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            aplicant.setFacultate(facultate);
            aplicant.setAn_studii(an_studii);
            studenti.add(aplicant);
        }
        input.close();
        return studenti;
    }
}
