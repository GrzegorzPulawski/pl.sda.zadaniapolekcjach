package SobotaZadania;

import java.util.Scanner;

public class MainParsherUniversity {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String komenda;
        do {
            System.out.println("podaj komende");
            komenda = scanner.next();
            if(komenda.equals(("dodaj"))) {
                System.out.println("Podaj nr indeksu");
                long indeks = scanner.nextLong();


                String imie = scanner.next();
                String nazwisko = scanner.next();

                university.dodaj(indeks, imie, nazwisko );
            }
        }while(!komenda.equalsIgnoreCase("koniec"));
    }

}
