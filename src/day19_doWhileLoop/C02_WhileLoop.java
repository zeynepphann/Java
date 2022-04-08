package day19_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        // kullanşcidan bir sayi alin
        // bu sayinin rakamlari toplamini yazdirin

        int input =7629;
        int rakam= 0;
        int rakamlarToplami=0;


        while (input > 0){
            rakam=input%10;
            rakamlarToplami+=rakam;
            input/=10;
         // loopun icinde yazdirirsak her islemden sonra yazdirir 7+6 13+2 gibi
        }
        System.out.println(rakamlarToplami);





    }

}
