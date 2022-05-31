package SobotaZadania;

import java.util.Objects;

public class ParaLiczb {
    //Utwórz klasę ParaLiczb, klasa powinna posiadać pole
    //int a;
    //int b;
    //konstruktor pełny
    //gettery i settery
    //toString
    //Stwórz Main a w nim kilka instancji klasy ParaLiczb: {(1,2), (2,1), (1,1), (1,2)}.
    //Wyświetl wszystkie elementy zbioru na ekran. Czy program działa zgodnie z oczekiwaniem?

    private int a;
    private int b;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParaLiczb)) return false;
        ParaLiczb paraLiczb = (ParaLiczb) o;
        return a == paraLiczb.a && b == paraLiczb.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public ParaLiczb(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "ParaLiczb{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
