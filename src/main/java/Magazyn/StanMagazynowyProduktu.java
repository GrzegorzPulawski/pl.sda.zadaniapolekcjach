package Magazyn;

public class StanMagazynowyProduktu {
    //Stwórz model, klasę StanMagazynowyProduktu:
    //nazwa
    //ilość (double)
    //jednostka (GRAM, SZTUKA, LITR)
    private String nazwa;
    private double ilosc;

    private Jednostka jednostka;

    public StanMagazynowyProduktu(String nazwa, double ilosc, Jednostka jednostka) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.jednostka = jednostka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getIlosc() {
        return ilosc;
    }

    public void setIlosc(double ilosc) {
        this.ilosc = ilosc;
    }

    public Jednostka getJednostka() {
        return jednostka;
    }

    public void setJednostka(Jednostka jednostka) {
        this.jednostka = jednostka;
    }

    @Override
    public String toString() {
        return "StanMagazynowyProduktu{" +
                "nazwa='" + nazwa + '\'' +
                ", ilosc=" + ilosc +
                ", jednostka=" + jednostka +
                '}';
    }
}
