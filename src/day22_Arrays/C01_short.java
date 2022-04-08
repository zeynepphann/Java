package day22_Arrays;

import java.util.Arrays;

public class C01_short {

    public static void main(String[] args) {


        String arr[]={"S", "M ","A" ,"T"};
        System.out.println(Arrays.toString(arr)); //[S, M , A, T]

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); //[A, M , S, T]
                                                  // java da bu siralamaya natural order denir
                                                  // sayi olursa kucukten buyuge
                                                  // metin olursa alfabetik siralamaya göre


    }
}
