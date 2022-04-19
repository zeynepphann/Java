package day47_linkedList;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {
        //verilen bir arrayden tekrar eden elementleri silip
        // unique elementlerden olusan bir array haline donduren
        // bir method yazin

        int arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};;

        arr=benzersizYap(arr);

    }

    private static int[] benzersizYap(int[] arr) {
        Set<Integer> benzersizSet= new TreeSet<>();
        for (Integer each : arr
             ) {
            benzersizSet.add(each);

        }
        System.out.println(benzersizSet);
        //Integer arrBenzersiz[]=new
        return arr;
        // sette index yapisi yoktur dolayisiyla for loop kullanamayiz

      //  int index=0;
      //  for (Integer each : benzersizSet
          //   ) {

        }
        }


    //}
