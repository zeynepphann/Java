package day23_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {

        // kullanicidan kac elementlik bir array olusturacagini sorun
        // arrayi olusturup elementleri kullanicdan alip , arraye atayin


        Scanner scan = new Scanner(System.in );
        System.out.println("lutfen kac elementli bir array istiyorsun yaz cabuk slk seni");

        int uzunluk = scan.nextInt();//5

        int arr[]= new int [uzunluk]; // [0,0,0,0,0]

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("array icin "+(i +1)+ ". eleman gir kopek ");
            arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));


}
}