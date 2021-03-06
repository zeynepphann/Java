package day40_overriding_polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exceptions {
    // kullanicidan istedigi kadar sayiyi alip toplayan bir program yaziniz
    //toplam 500u gecerse programi bitirsin veya
    // kullanici bitirmek istediginde 0 basmalidir
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam=0;

        do {
            System.out.println("lutfen bir toplamak istediginiz sayiyi giriniz \n bitirmek icin Q'ya basiniz ");
            int sayi= 0;


            try {
                sayi = scan.nextInt();
                toplam+=sayi;
            } catch (InputMismatchException e) {

                String hataliGiris=scan.next();
                if (hataliGiris.equalsIgnoreCase("q")){
                    System.out.println("Girdiginiz sayilarin toplami: " +toplam);
                    break;
                }else {
                    System.out.println("Hatali giris yaptiniz");
                }
            }

        }while (toplam<500);
    }



}
