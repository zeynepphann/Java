package day49_maps;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {

        List<Object> list=  new ArrayList<>();
        list.add("ergin");
        list.add(15);
        list.add(10.2);

        System.out.println(list);//[ergin, 15, 10.2]

         list.set(1,(Integer)list.get(1)+10);

        Map<Integer,String > sinifList=new HashMap<>();
        // bir sinifta ogrenci no ve isim soyisim ve brans olarak map olusturmak istiyoruz
        // key tek bir unique degerdir
        // ama value/ deger birden fazla bilginin birlesiminden olusabilir
        // bu durumda daha sonra istedigimiz bilgilere dogru  sekilde ulasabilmek icin
        // tum elementler icin value ayni bicimde olusturulmalidir
        // veri siralamasi ve sekilsel acidan
        sinifList.put(101,"ali, can, dev");
        sinifList.put(102,"veli, yan, qa");
        sinifList.put(103,"ali, yan, dev");
        System.out.println(sinifList);

        System.out.println(sinifList.keySet());

    }
}
