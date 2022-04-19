package day46_Iterator_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_IstenenElemanlariSilme {
    public static void main(String[] args) {

        /*
        bir listedeki istenen sayi araliginda olmayan
        elementleri silen bir progman yaziniz

         */
        List<Integer> liste= new ArrayList<>();

        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        ListIterator itr = liste.listIterator();
        while (itr.hasNext()){
            Object sayi= itr.next();
            if ((Integer)sayi <20 || (Integer)sayi>40){
                itr.remove();
            }
        }
        System.out.println(liste);


    }
}
