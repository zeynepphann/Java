package day19_doWhileLoop;

public class C03_doWhileLoop {

    public static void main(String[] args) {

        // while loop ile 5den kucuk sayiilari yazdiralim

        int input=3;

        int sayi=1;
        int sayac=1;


        while (sayi<input){ // while once kontrol sonra islem o yuzden bir kere fazla calisir

            System.out.println(sayi);
            sayac++;
            sayi++ ;

        }
        System.out.println("sayac: " + sayac);



        sayi=1;
        do {
            System.out.println(sayi);
            sayi++ ;
        } while (sayi<input);





    }
}
