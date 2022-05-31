package listazadan;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainLiztaZadanDoZrealizowania {
    public static void main(String[] args) {
        //Stwórz klasę ListaZadanDoZrealizowania i w niej:
        //i. pole z listą zadań do zrealizowania
        //ii. następujące metody:
        //1. dodaj zadanie
        //2. znajdź i wypisz zadanie (po jego PEŁNEJ nazwie)
        //3. znajdź i wypisz zadanie (po szukanej frazie która może być częścią
        //nazwy)
        //4. zwróć zadanie (po jego PEŁNEJ nazwie)
        //5. zwróć zadanie (po szukanej frazie która może być częścią nazwy)
        //6. usuń zadanie


        List listaZadanDoZrealizowania = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podac zadanie:");
        Zadanie zadanie = new Zadanie();
        System.out.println("Teraz dodamy ją do listy.");



    }


}

