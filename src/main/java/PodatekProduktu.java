public enum PodatekProduktu {
    //Stwórz enum PodatekProduktu i dodaj wartości:
    //VAT8
    //VAT23
    //VAT5
    //NO_VAT

    VAT8(0.08),
    VAT23(0.23),
    VAT5(0.05),
    NO_VAT(1);

    PodatekProduktu(double vat) {
    }
    public static int getWartoscPodatku(){
        return PodatekProduktu;
    }
}
