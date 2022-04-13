package day42_exception;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas<=0 || yas>120){
            //  System.out.println(" lutfen gecerli bir yas giriniz ");
            //java bizim istedigimiz durumlarda exc. firlatabilir
            throw new IllegalArgumentException();

        }else{
            System.out.println("uygun yas giriniz ");

        }
    }
    /*
    kullanicidan yasini isteyim kullanici yas olrak
    negatif bir sayi
    0 vaye 120> girerse illegalargumentexc. olusacak sekilde bir program giriniz


     */

}
