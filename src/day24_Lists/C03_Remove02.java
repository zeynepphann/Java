package day24_Lists;

import javax.xml.parsers.SAXParser;
import java.util.ArrayList;
import java.util.List;

public class C03_Remove02 {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(5); // [5]
        sayilar.add(3); // [5,3]
        sayilar.add(0,7); //[7,5,3]
        sayilar.add(2,7); //[7,5,7,3]

        sayilar.remove(3); // index olarak 3 deki elementi siler
        //sayilar.remove(5); indexOutOfBoundsException

        /*
        sayilarda olusan bir listte objeyi vererek element silme methodu calismaz
        sayi degeri gidigimizde java otomatik olarak sayiyi index kabul eder

         */


        //int sayi= 5 ; indexOutOfBoundsException
         //sayilar.remove(sayi);

        Integer sayi= 5; // Integer wrapper class'i kullaninca sayi obje oldugundan,
                         // bu method calisir
        sayilar.remove(sayi);
        System.out.println(sayilar);






    }
}
