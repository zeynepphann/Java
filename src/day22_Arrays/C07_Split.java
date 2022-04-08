package day22_Arrays;

import java.util.Arrays;

public class C07_Split {

    public static void main(String[] args) {


        String str= "java gun gectikce guzellesiyor";

        String kelimeler []= str.split(" "); // speac'leri oldurur
        System.out.print(Arrays.toString(kelimeler));
        System.out.print(kelimeler[1]); // gun



        String gectikce[]= str.split("gectikce"); // bosluklar duruyor
        System.out.println(Arrays.toString(gectikce)); // java gun ,  guzellesiyor

        String harfler[]= str.split("");
        System.out.printf(Arrays.toString(harfler)); //[j, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]






    }
}
