package Magazyn;

import java.util.LinkedList;
import java.util.List;

public class OperacjeMagazyn {
    private List<StanMagazynowyProduktu> produkty;

    public OperacjeMagazyn() {
        produkty = new LinkedList<>();
    }
    public void dodajProdukt (String nazwa, double ilosc, Jednostka jednostka){
        StanMagazynowyProduktu newProdukt = new StanMagazynowyProduktu(nazwa, ilosc, jednostka);
        produkty.add(newProdukt);
    }

    public List<StanMagazynowyProduktu> getProdukty() {
        return produkty;
    }

    public void setProdukty(List<StanMagazynowyProduktu> produkty) {
        this.produkty = produkty;
    }
    public void wypiszStanMagazynu() {
        System.out.println("Stan Magazynu:");
        System.out.println(produkty);
    }

}

