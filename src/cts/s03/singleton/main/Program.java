package cts.s03.singleton.main;

import cts.s03.singleton.clasaBazaDeDate.ConexiuneBazaDeDate;
import cts.s03.singleton.sustinereExamen.Student;
import cts.s03.singleton.sustinereExamen.SustinereExamen;

public class Program {


    public static void main(String[] args) {

        ConexiuneBazaDeDate conexiuneBazaDeDate = ConexiuneBazaDeDate
                .getInstance("Baza1", 3, "link");
        ConexiuneBazaDeDate conexiuneBazaDeDate2 = ConexiuneBazaDeDate
                .getInstance("Baza2", 4, "link2");

        System.out.println(conexiuneBazaDeDate);
        System.out.println(conexiuneBazaDeDate2);
        conexiuneBazaDeDate.setNumeBaza("NouaBaza");
        System.out.println(conexiuneBazaDeDate);

        Student  s1 = new Student(1,"Ioan" , "ioan@gmail.com", 2);
        Student  s2 = new Student(2,"Elena" , "elena@gmail.com", 2);
        Student  s3 = new Student(3,"Maria" , "maria@gmail.com", 3);
        Student  s4 = new Student(4,"Alex" , "alex@gmail.com", 1);

        SustinereExamen examenPoo = new SustinereExamen("Programare Orientata Obiect");
        SustinereExamen cts = new SustinereExamen("CTS");

        examenPoo.addStudent(s1);
        examenPoo.addStudent(s1);
    }
}
