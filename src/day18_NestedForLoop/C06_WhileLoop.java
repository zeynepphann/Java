package day18_NestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan iki tan sayi alip bu sayilari ve aralarindaki tüm tam sayilari
        // yazdiran bir kod olusturun

        int baslangic = 40 ;
        int bitis= 60 ;


        for (int i = baslangic; i <= bitis; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // ayni soruyu while loop ile yapalim

        int i = baslangic;
        while (i<=bitis) {
            System.out.print( i + " ");
            i++;
        }
        System.out.println("");
        System.out.println(baslangic);




    }
}
