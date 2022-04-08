package day25_Lists02;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {
        
        int arr[]= {3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=3;
        
        istenmeyenElemanSil(arr,istenmeyenEleman);
        
        
        
    }


    private static void istenmeyenElemanSil(int[] arr, int istenmeyenEleman) {
        //1- istenmeyen element sayisini bulalim
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]== istenmeyenEleman){
                sayac++;
            }

        }
       //-2 yeni element olusturalim

        int arrYeni []= new int[arr.length-sayac];

        // 3- eski arrayden uygun elementleri yeniye tasi
        int index=0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]!= istenmeyenEleman){
                arrYeni[index]= arr[i];
                index++;
            }

        }

        // 4- listeyi yazdirin
        System.out.println(Arrays.toString(arrYeni));

    }
}
