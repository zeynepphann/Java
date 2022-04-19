package day46_Iterator_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);

        Iterator itr = liste.iterator(); /*
        iterator methodu olusturdugumuz liste objesi
        uzerinden ArrayList class'indan calistiriyoruz

       iterator nasil calisir
       bir iteratior objesi olusturmak icin collection uyesi
       bir obje kullanmaliyiz
       yani biz bu iterator objesini bizim ornegimizde liste objesi uzerinde
       calismak icin olusturmus olduk
       biz iterator objesini olusturdugumuzda
       iterator collection'in ilk elen=mentinin oncesine gidip bekler

          itr.hasNext(); (yaninda element var mi) true yada false dondurur
           [(itr) 5, 7, 8, 6, 9]
           itr.next() iterator bir sonraki elementin yanina gecer
           ve uzerinden gectigi elementi bize dondurur

        */

        System.out.println( itr.hasNext()); // true
        System.out.println(itr.next()); // yaninda ne varsa yazdirir 5
        System.out.println(itr.next()); // bir daha yazdirirsak 7
        itr.remove(); //iteration'un elinde olan elementi sildi
        System.out.println(liste);
        //itr.remove(); iteraton'un elinde olan elementi sildi dolayisiyla
        // ust uste iki kere itr.remove();KULLANILMAZ

        // once itr.next(); methodunun calistirip iterationun bir ekement almasini saglamaliyiz




        /*bir obj uzerinden method calisacak
        ilk once data turu olan class'a gider(List) list classinda iterator methodunu arar
        iterator interface de oldugu icin body'si yok
        bu body'siz iterator'i bulduktan hemen sonra calistirmaz
        override edilmis mi diye child class'i kontrol eder
        override edilmisse .iterator(); burayi kullanir.




         bodysi olmayan bir method calistimaya calisiyor

        Burada sol taraftaki iterator kucuk i ile cunku bu bir method
        bizim olusturdugumuz liste'yi kullanarak listenin bagli oldugu
        list class'indan iterator method'unu kullanacak
         */


    }
}
