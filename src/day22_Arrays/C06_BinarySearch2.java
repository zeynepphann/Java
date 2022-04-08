package day22_Arrays;

import java.util.Arrays;

public class C06_BinarySearch2 {
    public static void main(String[] args) {

        int arr[]= {3,5,6,1,9,0,45,25,4,12};
        int istenenSayi=14;

        // eger javadan hazir binarysearch ile yapmak isterseniz
        // once sort methodunu kullanip sonra binarysearch yapmaliyiz
        //binarysearch () bize istenen sayinin olduguindexi verir

        Arrays.sort(arr); //
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,istenenSayi)); // bize istedigimiz elementin indexini doner
        // eger olmayan bir seyi aratiyorsak - doner sayisini eger o sayi olsaydi kacinci sirada olurdu onu bulup ona göre eksi li
        // sonuc verir orn: 2 arasaydık -3 veriridi 3. sirada oldugu icin

        //olan sayilar index döner



    }

}
