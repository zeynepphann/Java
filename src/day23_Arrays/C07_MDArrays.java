package day23_Arrays;

import java.util.Scanner;

public class C07_MDArrays {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=scan.nextLine();


        String arr[]=cumle.split(" ");
        System.out.println("girdiginşz cumleeki kelime sayisi: " + arr.length);



    }
}
