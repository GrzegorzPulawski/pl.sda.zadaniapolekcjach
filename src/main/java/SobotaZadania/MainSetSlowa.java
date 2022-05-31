package SobotaZadania;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainSetSlowa {
    //Stwórz Main'a (MainSetSlowa) użytkownik ma wpisać jedną linię tekstu ze scannera:
    //wczytaj linię tekstu
    //podziel linię na słowa
    //wypisz unikalne słowa wpisane przez użytkownika
    //wypisz unikalne litery wpisane przez użytkownika
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz linie tekstu");
        String liniaTekstu = scanner.nextLine();

        String[]tabicaSlow = liniaTekstu.split(" ");
        Set<String> zbiorSlow = new HashSet<>(Arrays.asList(tabicaSlow));

        System.out.println(zbiorSlow);









    }
}
