package SobotaZadania;

import java.util.HashSet;
import java.util.Set;

public class MainParaLiczb {
    public static void main(String[] args) {


        ParaLiczb p1 = new ParaLiczb(1,2);
        ParaLiczb p2 =  new ParaLiczb(2,1);
        ParaLiczb p3 = new ParaLiczb(1,1);
        ParaLiczb p4 = new ParaLiczb(1,2);

        Set<ParaLiczb>zbiorParLicz= new HashSet<>();
        zbiorParLicz.add(p1);
        zbiorParLicz.add(p2);
        zbiorParLicz.add(p3);
        zbiorParLicz.add(p4);

        System.out.println("Ilosc:" + zbiorParLicz.size());


    }

}
