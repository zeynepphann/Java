package day50_Maps;

import day49_maps.MapOlustur;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C01_Maps {
    public static void main(String[] args) {

         // siniftaki ogrenci listesini duzenli olarak yazdiralim

        /*
        eger keylere tek tek ulasmak istersek index yapisina ihtiyacimiz vae
        ancak map index yapisini desteklemez
        bunun icin keyleri once bir set'e sonra da set'in
        tum elementlerini bir list'e ekledik

        */
       Map<Integer,String> sinifList=MapOlustur.myMap();
       System.out.println(sinifList);

       Set<Integer> sinifKeySeti= sinifList.keySet();
       List<Integer> keyList=new ArrayList<>();
        for (Integer each : sinifKeySeti
             ) {
            keyList.add(each);
        }
        //keyList.addAll(sinifKeySeti); bu da olur

       //  System.out.println(keyList.get(2));

        // simdi de value



        



    }
}
