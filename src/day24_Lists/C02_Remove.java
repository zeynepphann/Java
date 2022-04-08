package day24_Lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler= new ArrayList<>();
        isimler.add("zeynep");
        isimler.add("betul");
        isimler.add("erkan");
        isimler.add("yusuf");

        isimler.remove("yusuf"); //true
        System.out.println(isimler);
        // remove methodu istenen elementi kaldirip
        // bize true veya false doner
        // eger remove isleminin yapildigini kontrol etmek istiyorsaniz methodu boolean bir variable'a atayabiliriz

        boolean sonuc = isimler.remove("yusuf ");
        // sonucu kullaniciya yazdirmak isterseniz
        // if else ile istediginiz degerlendirmeyi yazabilirsiniz

        if (sonuc==true ){
            System.out.println("isim silindi");
        }else {
            System.out.println("isim yok");
        }

        System.out.println(isimler);




        sonuc= isimler.remove("berk ");
        if (sonuc==true ){
            System.out.println("isim silindi");
        }else {
            System.out.println("isim yok");
        }

        // remove index yazdigimizde sildim/ silmedim olmaz cunku direk index veriyoruz
        // bize rempve edilen elementi doner

        System.out.println(isimler.remove(1));// betulu siler ve bize betul dondurur


       // yazdirsakta yazdirmasakta liste degisti ve 1. indexteki  element silindi






    }
}
