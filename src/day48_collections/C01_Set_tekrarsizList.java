package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set_tekrarsizList {
    public static void main(String[] args) {
        //verilen bir array'in tekrar eden elementlerini
        // sadece bir kere yazdiran bir method olusturunuz

        Integer arr[]= {3,5,4,5,6,7,8,3,4,5,7,8};
        arrayiTekrarsizYazdir(arr);

    }

    private static void arrayiTekrarsizYazdir(Integer[] arr) {
        Set<Integer>tekrarsizElementKumesi=new HashSet<>();
        for (Integer each :arr
             ) {
            tekrarsizElementKumesi.add(each);

        }
        System.out.println(tekrarsizElementKumesi);
    }
}
