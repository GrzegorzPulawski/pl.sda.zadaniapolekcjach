package Bilet;

public enum EnumBilet {
    ULGOWY_GODZINNY(2,60),
    ULGOWY_CALODNIOWY(20,1440),
    NORMALNY_GODZINNY(5,60),
    NORMALNY_CALODNIOWY(50,1440),
    BRAK_BILETU(100,1440);
    private double cena;
    int czasJazdywMinutach;


    EnumBilet(double cena, int czasJazdywMinutach) {
        this.cena = cena;
        this.czasJazdywMinutach = czasJazdywMinutach;
    }
    public double pobierzCeneBiletu(){
        return this.cena;
    }

    public int pobierzCzasJazdywMinutach() {
        return this.czasJazdywMinutach;
    }
    //Utworzyć metodę wyswietlDaneOBilecie():voidnp. „Bilet ulgowy 1-godzinny”
    String uprawnia = "i uprawnia do jazdy przez:";
    public void wyswietlDaneOBilecie(){
        System.out.println("Bilet ulgowy 1-godzinny, kosztuje:"+ ULGOWY_GODZINNY.cena + " zł" + uprawnia + ULGOWY_GODZINNY.czasJazdywMinutach+ " min");

    }

    public void wyswietlDaneOBilecieDniowym(){
        System.out.println("Bilet ulgowy calodniowy, kosztuje:"+ ULGOWY_CALODNIOWY.cena + " zł" + uprawnia + ULGOWY_CALODNIOWY.czasJazdywMinutach+ " min");
    }

    public void wyswietlDaneOBilecieDniowymNormalnym(){
        System.out.println("Bilet normalny calodniowy, kosztuje:"+ NORMALNY_CALODNIOWY.cena+ " zł" + uprawnia + NORMALNY_CALODNIOWY.czasJazdywMinutach+ " min");
    }
    public void wyswietlDaneOBilecieGodzinowymNormalnym(){
        System.out.println("Bilet normalny godzinny, kosztuje:"+ NORMALNY_GODZINNY.cena+ " zł" + uprawnia + NORMALNY_GODZINNY.czasJazdywMinutach+ " min");
    }




}






