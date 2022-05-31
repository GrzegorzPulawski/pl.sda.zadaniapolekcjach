public class KoszykZakupowy {

     private String nazwa;
     private double cena;
     private PodatekProduktu podatek;

    public KoszykZakupowy(String nazwa, double cena, PodatekProduktu podatek) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.podatek = podatek;
    }


    public double cenaBrutto() {
        return cenaBrutto();
        }

        public PodatekProduktu getPodatek() {
            return podatek;
        }

        public double getCena() {
            return cena;
        }

        @Override
        public String toString() {
            return "Produkt{" +
                    "nazwa='" + nazwa + '\'' +
                    ", cena=" + cena +
                    ", podatek=" + podatek +
                    '}';
        }
}
