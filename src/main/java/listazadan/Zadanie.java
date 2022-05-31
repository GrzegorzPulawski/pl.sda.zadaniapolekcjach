package listazadan;

import java.time.Instant;

public class Zadanie {
    //Stworz klasę Zadanie:
    //a. dodaj do niej pola:
    //i. Nazwa
    //ii. Tresc
    //iii. *czas dodania (należy przypsiać czas stworzenia w konstruktorze)
    //iv. Dodaj niezbędne gettery i settery, toString i konstruktory.
    private String nazwa;
    private String tresc;
    private Instant instant = Instant.now();


    public Zadanie() {
        this.nazwa = nazwa;
        this.tresc = tresc;
        this.instant = instant;

    }

    public String getNazwa() {
        return nazwa;
    }

    public String getTresc() {
        return tresc;
    }

    public  Instant getInstant() {
        return  instant;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    @Override
    public String toString() {
        return "Zadanie{" +
                "nazwa='" + nazwa + '\'' +
                ", tresc='" + tresc + '\'' +
                ", instant=" + instant +
                '}';
    }
}
