package Magazyn;

import java.util.Scanner;

public class MainMagazyn {
    public static void main(String[] args) {
        //dodajProdukt (po dodaniu stan magazynowy (ilość) ma być 0) (parametry: nazwa, jednostka)
        //wypiszWszystkieProdukty
        //usunProdukt (po nazwie)
        //zwrocProdukt(parametry: nazwa)
        //zwiekszStanMagazynowy (parametry: nazwa, ilość)
        //zmniejszStanMagazynowy (parametry: nazwa, ilość)
        //zwrocListeProduktowKtorychIloscJestMniejszaNiz (parametr: ilosc)

        OperacjeMagazyn operacjeMagazyn = new OperacjeMagazyn();

        Scanner scanner = new Scanner(System.in);
        String komenda;
        String wybor;
        Double ilosc = 0.0;


        do {
            System.out.println("Podaj komende:");
            komenda = scanner.next();
            if (komenda.equalsIgnoreCase("dodaj")) {
                System.out.println("Podaj nazwe produktu:");
                String nazwa = scanner.next();

                System.out.println("Podaj jakiej jednostki uzyc?: gramy, sztuki, litry:");
                wybor = scanner.next();
                if (wybor.equalsIgnoreCase(("gramy"))) {
                    operacjeMagazyn.dodajProdukt(nazwa, ilosc, Jednostka.GRAM);
                } else if (wybor.equalsIgnoreCase(("sztuki"))) {
                    operacjeMagazyn.dodajProdukt(nazwa, ilosc, Jednostka.SZTUKA);
                } else if (wybor.equalsIgnoreCase("litry")) {
                    operacjeMagazyn.dodajProdukt(nazwa, ilosc, Jednostka.LITR);
                }

            }operacjeMagazyn.wypiszStanMagazynu();


        }while (!komenda.equalsIgnoreCase("koniec"));

    }
}
