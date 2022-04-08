package day21_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[]={"Ali" ,"Veli " ,"Ayse "};
        // arry icindeki elementlere ulasabilmek icin index kullaniriz


        System.out.println(arr1[0]); // ali
        arr1[1]= "zeynep";
        System.out.println(arr1[1]);

        // arrayin icindeki indexi kullanarak elementlere ulasabilir ve update edebiliriz

        int arr2[]= new int[4];
        System.out.println(arr2[1]); // 0
        System.out.println(arr2[3]); // 0
       // System.out.println(arr2[5]); // hata

        // Arrayin tamamini yazdirmak istersek


        System.out.println(arr2); // [I@5b464ce8
                                  // arrayler non-primitive olduklarindan direk yazdirmak
                                 // istersek  java referans bilgisini yazdirir


        for (int i = 0; i <4 ; i++) {
            System.out.println(arr2[i] + " ");

        }
          System.out.println("");
         // arrayi yazdirmak icin Javadaki arrays classindan toString() kullaniriz
         // arrayler non primitive dolayisiyla sout ile direk yazdirilamazlar

        System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0]
        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2));//[0,11, 0, 22]

        System.out.println(Arrays.toString(arr1));

        // arrayin lenghti "n" dir n-1 le son  eleman bulunur











    }

}

