package day25_Lists02;

import java.util.ArrayList;
import java.util.List;

public class C03_listsdenElementSilme {
    public static void main(String[] args) {


        int arr[]= {3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3 ;
        
        istenmeyenElemanSilveYazdir(arr,istenmeyenEleman);
        
        
    }

    private static void istenmeyenElemanSilveYazdir(int[] arr, int istenmeyenEleman) {


        List<Integer> yeniListe= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]!= istenmeyenEleman){
                yeniListe.add(arr[i]);
            }


        }
        System.out.println((yeniListe));

    }
}
