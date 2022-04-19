package day46_Iterator_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_ListeyiTerstenYazdirma {
    public static void main(String[] args) {
        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        // once iteratator'i olusturup sonra yollayalim
        ListIterator itr= liste.listIterator();

        while (itr.hasNext()){
            itr.next();
        }

        while (itr.hasPrevious()){
            System.out.println(itr.previous()+" ");
        }

    }
}
