package Bilet;

import java.util.Scanner;

public class DanePasazera {

    //wprowadzenie wieku pasażera, czasu przejazdu i kwoty
    public static int wprowadzWiek() {
        System.out.println("Wprowadż wiek:");
        return new Scanner(System.in).nextInt();
    }

    public static int wprowadzCzasPrzejazu() {
        System.out.println("Wprowadż czas przejazdu:");
        return new Scanner(System.in).nextInt();
    }

    public static int wprowadzKwote() {
        System.out.println("Wprowadż kwotę:");
        return new Scanner(System.in).nextInt();
    }

    int rodzajbiletu = 0;

    //sprawdzenie czy przysługuje ulgowy godzinny
    public static double czyUlgowyGodzinny(int wiek, int czas, double kwota) {
        if (wiek < 18 && czas < 60 && kwota >= 2) {
            System.out.println(EnumBilet.ULGOWY_GODZINNY);
        } else if (wiek > 18 && czas < 60 && kwota >= 5) {
            System.out.println(EnumBilet.NORMALNY_GODZINNY);
        }else  if (wiek < 18 && czas >60 && kwota >=20){
            System.out.println(EnumBilet.ULGOWY_CALODNIOWY);
        }else if (wiek > 18 && czas >60 && kwota >=50){
            System.out.println(EnumBilet.NORMALNY_CALODNIOWY);
        }else System.out.println(EnumBilet.BRAK_BILETU);
        return kwota;
    }

}




