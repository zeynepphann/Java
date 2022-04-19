package day48_collections;

import javax.print.DocFlavor;
import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {
        String str= "Java cok guzel ";
        System.out.println(str.hashCode()); //-2044327444

        String str2= "hava cok guzel";
        System.out.println(str2.hashCode());//1531522390

        Set<Integer> sayiKumesi= new HashSet<>();
        System.out.println(sayiKumesi.hashCode());// bos kume list icin 0 verir
        sayiKumesi.add(10);
        System.out.println(sayiKumesi.hashCode());//10
        sayiKumesi.add(20);
        System.out.println(sayiKumesi.hashCode());//30
    }
}
