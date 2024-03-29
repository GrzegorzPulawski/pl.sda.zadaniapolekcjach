package Dziennik2;

import java.util.Optional;
import java.util.Scanner;

public class MainParsherUniversity {
    public static void main(String[] args) {
        University university = new University();

        Scanner scanner = new Scanner(System.in);
        String komenda;

        do {
            System.out.println("Podaj komende:");
            komenda = scanner.next();

            if (komenda.equalsIgnoreCase("dodaj")) {
                System.out.println("Podaj numer indeksu:");
                long numerIndeksu = scanner.nextLong();

                if (university.czyZawieraStudenta(numerIndeksu)) {
                    System.err.println("Student o takim numerze indeksu jest już dodany.");
                    continue; // rozpocznij pętlę do-while od nowa
                }

                System.out.println("Podaj imie:");
                String imie = scanner.next();

                System.out.println("Podaj nazwisko:");
                String nazwisko = scanner.next();

                university.dodaj(numerIndeksu, imie, nazwisko);
            } else if (komenda.equalsIgnoreCase("wypisz")) {
                university.wypiszWszystkichStudentow();
            } else if (komenda.equalsIgnoreCase("zawiera")) {
                System.out.println("Podaj numer szukanego indeksu:");
                long numerIndeksu = scanner.nextLong();

                if (university.czyZawieraStudenta(numerIndeksu)) {
                    System.out.println("Tak, taki student istnieje");
                } else {
                    System.err.println("Nie zawiera takiego studenta.");


                }
            } else if (komenda.equalsIgnoreCase("znajdz")) {
                System.out.println("Podaj numer szukanego indeksu:");
                long numerIndeksu = scanner.nextLong();

                Optional<Student> szukanyStudent = university.zwrocStudentaOptional(numerIndeksu);
                if (szukanyStudent.isPresent()) {
                    Student student = szukanyStudent.get();
                    System.out.println("Dane studenta: " + student);
                } else {
                    System.err.println("Nie zawiera takiego studenta");
                }
            }

        } while (!komenda.equalsIgnoreCase("koniec"));
    }
}