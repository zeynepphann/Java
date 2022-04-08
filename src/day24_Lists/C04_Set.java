package day24_Lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler= new ArrayList<>();
        isimler.add("zeynep");
        isimler.add("betul");
        isimler.add("erkan");
        isimler.add("yusuf");
        System.out.println(isimler);

        isimler.set(1,"nadire"); // betul gitti yerine nadire geldi
        System.out.println(isimler);

        List<String> logListesi =new ArrayList<>();
        logListesi.add(isimler.set(2,"cosmos"));

        System.out.println(isimler); //[zeynep, nadire, cosmos, yusuf]
        System.out.println(logListesi); //[erkan]

        // set methodu var olan bir indexin yerine ekleme yapabilir
        // add methodu var olmayan bir indexi olusturup atamamizi saglar




    }
}
