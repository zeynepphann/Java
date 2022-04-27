package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> myMap=new HashMap<>();
        myMap.put("H", 3);
        myMap.putIfAbsent("K",5);
        //bir ekleme yapmak isedigimizde key daha once eklenmisse map'e eklensin
        //daha onceden eklenmisse, eskiyi silmek icin bizi uyarsin

        System.out.println(myMap.putIfAbsent("A",6));

        if (myMap.putIfAbsent("K",20)!=null){
            System.out.println("Girdiginiz key Map'de zaten var ");
        }

        System.out.println(myMap);
        myMap.put("A",10);

        System.out.println(myMap);

        myMap.computeIfAbsent("A",v->20); // A yoksa ekler varsa eklemez oldugu gibi birakir

        //compute(key, (key,value) value)-->yeniDeger); verilen map'deki istenen key degerine
        // sahip elemanin value'sunu gunceller key map'te yoksa ekler
        myMap.compute("A",(key,value) ->20);
        System.out.println(myMap);

        // H NIN DEGERINI 2 katinin 5 fazlasi yapalim
        myMap.compute("H", (key,value)->(2*value+5));
       // myMap.compute("H", (m,n)->(2*n+5)); ne yazildiginin onemi yok yine de calisir
        System.out.println(myMap);

    }
}
