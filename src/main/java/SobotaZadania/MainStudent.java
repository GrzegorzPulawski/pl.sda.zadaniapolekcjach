package SobotaZadania;

import Dziennik2.Student;

import java.util.*;



public class MainStudent {
    //sprawdz czy mapa zawiera studenta o indeksie 100200
    //wpisz studenta o indeksie 101201
    //ilu jest studentow
    //wypisz wszystkich studentow
    public static void main(String[] args) {
        Student student1 = new Student(100200,"Grzegorz", "Kowalski");
        Student student2 = new Student(101201, "Marcin", "Nowak");

        Map<Long, Student> mapa = new HashMap<>();

        mapa.put(student1.getNumerindeksu(), student1);
        mapa.put(student2.getNumerindeksu(), student2);

        boolean czyNrIndeksu = mapa.containsKey(100200L);


        System.out.println(czyNrIndeksu);
        System.out.println(mapa.get(101201L));
        System.out.println(mapa.size());
        System.out.println(mapa);

        //mapa iteracja:
        //klucze
        mapa.keySet();
        for (Long indeks: mapa.keySet()){
            System.out.println(indeks + " ");
            }
        System.out.println();
        //wartosci
        mapa.values();
        //pary klucz-wartosc
        mapa.entrySet();



    }
}
