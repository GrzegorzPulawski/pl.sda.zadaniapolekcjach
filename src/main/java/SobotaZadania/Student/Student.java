package SobotaZadania.Student;

public class Student {
    private long numerindeksu;
    private String imie;
    private  String nazwisko;

    public Student(long numerindeksu, String imie, String nazwisko) {
        this.numerindeksu = numerindeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public long getNumerindeksu() {
        return numerindeksu;
    }

    public void setNumerindeksu(long numerindeksu) {
        this.numerindeksu = numerindeksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numerindeksu=" + numerindeksu +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}

