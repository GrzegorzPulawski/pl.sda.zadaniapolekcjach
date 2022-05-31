package Bilet;

import java.util.Scanner;

import static Bilet.DanePasazera.*;

public class MainBilet {
    //Zamodelować sytuację zakupu biletu
    //2.Utworzyć enumBilet
    //3.Nadać następujące wartości:
    //a.ULGOWY_GODZINNY
    //b.ULGOWY_CALODNIOWY
    //c.NORMALNY_GODZINNY
    //d.NORMALNY_CALODNIOWY
    //e.BRAK_BILETU
    //4.Dodać konstruktor przyjmujący 2 parametry:
    //a.cena (double)
    //b.czasJazdyw minutach (int)
    //5.Nadać odpowiednie wartości startowe
    //6.Utworzyć metodę pobierzCeneBiletu():int
    //7.Utworzyć metodę pobierzCzasJazdy():int
    //8.Utworzyć metodę wyswietlDaneOBilecie():voidnp. „Bilet ulgowy 1-godzinny”
    //9.Utwórz kilka biletów, wywołaj metody i przetestuj działanie
    //10.* Utwórz metodę statyczną przyjmująca wiek osoby kupującej bilet,
    // czas jazdy w minutach oraz kwotę –zwróć odpowiedni bilet
    // (w przypadku niewystarczających środków zwróć BRAK_BILETU
    public static void main(String[] args) {

        System.out.println(EnumBilet.ULGOWY_GODZINNY.pobierzCeneBiletu());
        System.out.println(EnumBilet.ULGOWY_GODZINNY.pobierzCzasJazdywMinutach());
        EnumBilet.ULGOWY_GODZINNY.wyswietlDaneOBilecie();

        System.out.println(EnumBilet.ULGOWY_CALODNIOWY.pobierzCeneBiletu());
        System.out.println(EnumBilet.ULGOWY_CALODNIOWY.pobierzCzasJazdywMinutach());
        EnumBilet.ULGOWY_CALODNIOWY.wyswietlDaneOBilecieDniowym();

        //wywołanie metody
        int wiek = wprowadzWiek();
        int czas = wprowadzCzasPrzejazu();
        int kwota = wprowadzKwote();
        
       // if (czyUlgowyGodzinny(wiek,czas,kwota)){
         //   System.out.println("Przysługuje Ci"+ EnumBilet.ULGOWY_GODZINNY);
        //}else System.out.println("Nie przysługuje");
        czyUlgowyGodzinny(wiek,czas, kwota);



        

    }
}