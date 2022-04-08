package day22_Arrays;

public class C08_Split2 {
    public static void main(String[] args) {

        // Verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran
        // bir method olusturun



        String cumle= "Nerede o 'hello world' yazdiramayan ogrenciler?";
        String harf="e";

        harfKacKereKullanilmis(cumle, harf);





    }

    private static void harfKacKereKullanilmis(String cumle, String harf) {

        int sayac=0;

        String karakterler[]=cumle.split(""); // her bir harfi ayiracak

        for (int i = 0; i < karakterler.length ; i++) {
            if (karakterler[i].equals(harf)){
                sayac++;

            }

        }
        System.out.println("aradiginiz  " + harf + " verilen  cumlede " + sayac+ " adet kullanilmis ");




    }
}
