package day43_garbage_abstractClass;

public class C02_Final extends C01_Final{



    public static void main(String[] args) {
        System.out.println(C01_Final.okulIsmi); // ulasabilirim
        // C01_Final.okulIsmi="okul "; burada da deger atamasi yapamam

    }



    public static final void method1(){
        System.out.println("Parent class final method1");
        /*
            Overrid parent classtaki methodu child classa uyarlamak demektir
            tani islevini degistirmek istiyoruz ancak parent classtaki
            method final olarak tanimlandigindan java methodun uyarlanmasina izin vermiyor

             */

    }
}
