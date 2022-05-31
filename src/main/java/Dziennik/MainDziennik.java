package Dziennik;

import java.util.Optional;

public class MainDziennik {
    public static void main(String[] args) {

        Dziennik dziennik = new Dziennik();
        dziennik.dodajStudenta("123456", "Pawel","Gawel");
        dziennik.wypiszListeStudentow();
        dziennik.usunStudenta("123456");
        dziennik.usunStudenta("666666");

        Optional<Student> optionalStudent = dziennik.zwrocStudenta("88888");
        if (optionalStudent.isPresent()){
            Student student = optionalStudent.get();
            System.out.println("Imie i nazwisko"+ student.getImie() +" " + student.getNazwisko());
        }
    }

}
