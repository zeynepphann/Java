package day46_Iterator_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElementleriniArtirma {
    public static void main(String[] args) {
        //verilen listedeki her elementi  3 artirin
        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);
        /*
        listenin tum elementlerini bize getirmesi icin
        iterationun hasnext() ve next() methodlarini kullanacagiz

         */

        ListIterator itr= liste.listIterator(); // listleri eklemeliyiz

        while (itr.hasNext()){ // yaninda element oldugu muddetce calisacak

           Object sayi= itr.nextIndex();
            itr.set((Integer)sayi+3);

        }
        System.out.println(liste);
    }
}
