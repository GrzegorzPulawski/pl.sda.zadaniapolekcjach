package Dziennik;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Dziennik {
    private Map<String, Student> mapaStudentow = new HashMap<>();

    public void dodajStudenta(String numerIndeksu, String imie, String nazwisko) {
        if (mapaStudentow.containsKey(numerIndeksu)) {
            System.err.println("Jest juz w systemie");

        } else {
            mapaStudentow.put(numerIndeksu, new Student(numerIndeksu, imie, nazwisko));
        }
    }

    public void wypiszListeStudentow() {
        System.out.println("Lista studentow");
        for (Student student : mapaStudentow.values()) {
            System.out.println(student);
        }
    }

    public void usunStudenta(String numerIndeksu) {
        if (mapaStudentow.containsKey(numerIndeksu)) {
            mapaStudentow.remove(numerIndeksu);
            System.out.println("Usunieto studenta " + numerIndeksu);

        } else {
            System.err.println("Student o podanym nr nie istnieje");

        }
    }

    public Optional<Student> zwrocStudenta(String indeks) {
        if (mapaStudentow.containsKey(indeks)) {
            System.out.println("Znaleziono studenta z nr indeksu " + indeks);
                return Optional.of(mapaStudentow.get(indeks));
            }else{
                System.out.println("Student o podanym nr indeksu nie istnieje");
                return Optional.empty();
        }
    }
}

