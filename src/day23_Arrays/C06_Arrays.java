package day23_Arrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {

        int arr[] = {3, 5, 7};
        int eklenecekElement = 4;


        arr = arrayeElemanEkle(arr, eklenecekElement);
        System.out.println(Arrays.toString(arr));


    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekElement) {

        int yeniArray[]= new int[arr.length+1]; //[0,0,0,0]

        for (int i = 0; i <arr.length ; i++) {
            yeniArray[i]=arr[i];


        }
        yeniArray[yeniArray.length-1]= eklenecekElement;


        return yeniArray;




    }
}
