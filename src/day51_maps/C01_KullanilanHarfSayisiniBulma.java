package day51_maps;

import java.awt.font.FontRenderContext;
import java.util.HashMap;
import java.util.Map;

public class C01_KullanilanHarfSayisiniBulma {
    public static void main(String[] args) {
       /* Soru 1 ) Verilen bir String’deki harfleri
        ve harflerin kacar kez kullanildigini return eden bir method yaziniz
        Ornek : Input : Hellooo   output : H=1, e=1, l=2, o=3
                */

        String input="Hellooo";
        String harflerArr []=input.split("");

        Map<String ,Integer> kullanimSayilari= new HashMap<>();
        /*
        FOR I ILE COZUMU
         for (int i = 0; i <harflerArr.length ; i++) {

            if (kullanimSayilari.containsKey(harflerArr[i]));
            kullanimSayilari.put(harflerArr[i], kullanimSayilari.get(harflerArr[i]+1));

        }
         */

        for (String each: harflerArr
             ) {
         if (kullanimSayilari.containsKey(each)){
             kullanimSayilari.put(each,kullanimSayilari.get(each)+1);

         }else kullanimSayilari.put(each,1);
        }
        System.out.println(kullanimSayilari);

    }
}
