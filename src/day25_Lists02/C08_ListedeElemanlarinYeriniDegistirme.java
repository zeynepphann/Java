package day25_Lists02;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarinYeriniDegistirme {
    public static void main(String[] args) {

     // verilen bir listede istenen 2 indexteki
     // elementlerin yerini kalici olarak degistiren bir method olusturun

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);


        int ilkIndex = 2;
        int ikinciIndex = 5;

        sayilar= swapElements(sayilar,ilkIndex,ikinciIndex);


    }

    private static List<Double> swapElements(List<Double> sayilar, int ilkIndex, int ikinciIndex) {

    // bir temp sayi olusurup
        // verilen indexlerdeki sayilari yer degistirin
        // indexleri kontrol edip sinirin otesinde index verildiyse uyari mesaji yazdirin


        return sayilar;
    }
}
