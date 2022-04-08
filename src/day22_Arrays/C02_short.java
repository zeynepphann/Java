package day22_Arrays;

import java.util.Arrays;

public class C02_short {

    public static void main(String[] args) {
        // verilen bir arrayde en kucuk ve en buyuk degerleri yazdirin


        int arr[]= {3,5,6,1,9,0,45,25,4,9,0};

        // short methodu olmadan yapalim

        int enKucukSayi=arr[0]; // bir diger ihtimal buyuk olsun diye Integer.MAX_VALUE de atanabilir
        int enBuyukSayi=Integer.MIN_VALUE; //arr[0] da olur

        for (int i = 0;  i< arr.length ; i++) {

            if (arr[i] <enKucukSayi){
                enKucukSayi =arr[i];

            }
            if (arr[i]>enBuyukSayi){
                enBuyukSayi=arr[i];

            }
        }
        System.out.printf("arraydeki en kucuk sayi: "+ enKucukSayi);
        System.out.printf("arraydeki en buyuk sayi: "+ enBuyukSayi);


        Arrays.sort(arr); // bu siralama yaptiktan sonra en buyuk sonda en kucuk basta
        System.out.println("Arraydeki en kucuk sayi: " + arr[0]);
        System.out.println("Arraydeki en buyuk sayi: " + arr[arr.length-1]);



    }
}
