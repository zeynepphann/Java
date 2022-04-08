package day22_Arrays;

import java.util.Arrays;

public class C04_TerstenSiralayipKaydetme {
    public static void main(String[] args) {

        // verilen bir arrayi buyukten kucuge siralayip bize donduren method olusturun

        int arr[] = {3, 5, 1, 9, 45, 25, 4, 9, 0};


        arr = terstenSirala(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr.length-1);


    }

    private static int[] terstenSirala(int[] arr) {
        Arrays.sort(arr); // 0 3 4 5 6 7 54 43
        int tersArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tersArr[i] = arr[arr.length - 1 - i];

        }
        return tersArr;

    }
}
