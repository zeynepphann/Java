package day22_Arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {

    public static void main(String[] args) {
        // verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturunuz



        int arr[]= {3,6,5,3,4,54,6,7,0,43};
        terstenSiralaYazdir(arr);

    }

    private static void terstenSiralaYazdir(int[] arr) {

        Arrays.sort(arr); // 0 3 4 5 6 7 54 43
        int tersArr[]= new int [arr.length];

        for (int i = 0; i <arr.length ; i++) {
            tersArr[i]= arr[arr.length-1-i]; // sadece -1 olarak kalsa her indexe ayni sayiyi atar
                                             // böylece i ye bagli olarak degisecek


        }
        System.out.print(Arrays.toString(tersArr));

    }
}






