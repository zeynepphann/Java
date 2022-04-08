package day21_Arrays;

import java.util.Arrays;

public class C03_Arrays {

    public static void main(String[] args) {

        int arr[]; // deger atamasi yapmadik ama java kabul etti ancak kullanmamiza izin vermez

        arr=new int[6];
        System.out.println(Arrays.toString(arr)); //[0,0,0,0,0,0]
        System.out.println(arr.length); // arrayin element sayisini verir
                                         // 6
                                         // String deki lenght () , bunda yok

        // arraydeki her bir elemani index degeri kadar artiralim

        for (int i = 0; i < arr.length ; i++) {
            arr[i] +=i; // index sayisi kadar artirma
        }

        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4, 5]

        // son indexteki elementi yazdiralim
        System.out.println(arr[arr.length-1]); // 5

        System.out.println(arr[3]);







    }
}
