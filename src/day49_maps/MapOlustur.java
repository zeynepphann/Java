package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer,String >myMap(){
        Map<Integer,String > sinifList=new HashMap<>();
        sinifList.put(101,"ali, can, dev");
        sinifList.put(102,"veli, yan, qa");
        sinifList.put(103,"ali, yan, C#");
        sinifList.put(104,"Ayse, Kan, C#, 2001");
        sinifList.put(105,"Fatma, Han, Java, 2002");
   return sinifList;
    }
}
