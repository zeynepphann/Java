package day19_doWhileLoop;

public class C01_WhileLoop {

    public static void main(String[] args) {

        // ) Kullanicidan bir sayi alin ve
        // bu sayinin rakamlari toplamini yazdirin

        int input= 20;

        int bolen=1;
        int sayac=0;

        while (bolen<=input){

            if (input % bolen ==0){
                System.out.println(bolen + " ");
                sayac++;
            }
            bolen++;

        }

        System.out.println("");
        System.out.println(input + "sayisini bolen "+ sayac +"adet sayi vardir");




    }
}
