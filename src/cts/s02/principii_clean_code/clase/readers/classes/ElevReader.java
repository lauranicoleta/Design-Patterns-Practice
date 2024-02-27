package cts.s02.principii_clean_code.clase.readers.classes;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Elev;
import cts.s02.principii_clean_code.clase.readers.interfaces.AplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {
    public ElevReader(String fileName){
        super(fileName);
    }
    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(getFileName()));
        scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Elev aplicant = new Elev();
            super.readAplicant(scanner, aplicant);
            int clasa = scanner.nextInt();
            String tutore = scanner.next();
            aplicant.setClasa(clasa);
            aplicant.setTutore(tutore);
            elevi.add(aplicant);
        }

        scanner.close();
        return elevi;
    }
}
