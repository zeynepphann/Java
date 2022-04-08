package day23_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        // verilen bir arraye yeni bir element ekleyen bir method olusturunuz


        int arr[]={3,5,7};
        // arr[3]=8; ekleme yapilmaz
        // arr ={1,3,6}
        // var olan bir arraye ayni boyutta olsa dahi atama yapmayiz

        arr= new int [4];
        System.out.println(Arrays.toString(arr));

        int arrYeni[]= new int [5];
        arr=arrYeni;
        System.out.println(Arrays.toString(arr));


        arrYeni[0]=2;
        arrYeni[3]=5;

        arr= arrYeni;

        // bir arraye icinde hazir elementlerin oldugu oldugu yeni bir array atamak isterseniz
        // bunu [1,2,3] seklinde yazarak degil
        // new int [3] diyerek olsuturup sonra deger atayarak tamamladigimiz bir arrayi
        //assing ederek yapariz


        int arrEnYeni []= {1, 2, 3, 4, 5};
        arr=arrEnYeni;
        System.out.println(Arrays.toString(arr));



    }
}
