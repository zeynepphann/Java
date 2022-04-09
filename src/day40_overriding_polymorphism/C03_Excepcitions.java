package day40_overriding_polymorphism;

import java.util.Scanner;

public class C03_Excepcitions {
    public static void main(String[] args) {

        // kullanicidan iki sayi alip bolerek sonucu yazdiran bir
        // program yaziniz

        Scanner scan = new Scanner(System.in);

        int kontrol=0;
        while (kontrol!=2){

            System.out.println("bolmek istediginiz sayiyi yaziniz");
            int sayi1= scan.nextInt();

            System.out.println("kaca bolmek  istediginizi yaziniz");
            int sayi2= scan.nextInt();

            try {
                System.out.println("sonuc " + sayi1/sayi2);
            } catch (Exception e) {
                e.printStackTrace(); // code surround with
            }

            System.out.println("devam etmek icin 1 \n bitirmek icin 2'ye basiniz ");
            kontrol= scan.nextInt();
        }







        /*
          sayi2 0 old. sayi1/0 tanimsiz olacagindan java bu durumla karsilasinca
          exeption atar
          javanin yazdigi mesajda exception ne tur bir sorun oldugu
          neden kaynaklandigi
          ve hangi satirda olustugu yazar

          bunu cozmek icin sayi2 yi if ile kontrol edebiliriz



          Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day40_overriding_polymorphism.C03_Exepcitions.main(C03_Exepcitions.java:19)

           if (sayi2==0){
            System.out.println("sayi/0 tanimsizdir");
        }else {
            System.out.println("sonuc " + sayi1/sayi2);
        }
        bu yontem her sonucta calismaz
         */



    }
}
