package day25_Lists02;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListeOlusturma {
    public static void main(String[] args) {
        // verilen bir arrayi liste cevirin

         String arr[]={"A", "B", "C"};
         List<String> arraydenList= Arrays.asList(arr);

         // arrayden liste cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz
         // dolayisiyla yeni list ile add, remove clear gibi methodlar calistirmak
         // istedigimizde  java exception  olusur

         // arraydenList.add("J");
        System.out.println("18.satirda array : " +arraydenList);
        arr[1]="F";

        System.out.println("21.satirda array : " +Arrays.toString(arr));
        System.out.println("22.satirda array : " +arraydenList);

        arraydenList.set(0,"Y");
        System.out.println("25.satirda array : " +Arrays.toString(arr));
        System.out.println("26.satirda array : " +arraydenList);




    }
}
