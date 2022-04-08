package day18_NestedForLoop;

public class C02_NestedForLoop {

    public static void main(String[] args) {


        // kullanicidan bir rakam alip carpim tablosu olusturalim

        int input =3;

        // 1 2 3   1*1  1*2  1*3   1. carpan i ıkıncı carpan j
        // 2 4 6   2*1  2*2  2*3   i de j de 1'den 3 e kadar j de 1'den 3 e kadar
        // 3 6 9   3*1  3*2  3*3

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <= input ; j++) {
                System.out.print((i*j)+ " ");
                 // System.out.println(""); eger burada bos yazdirisam her rakami alt alta yazdirir
            }
            // i burada artip iki olur o yuzden buraya alt sayira gecsin diye bos sout yazdirilir
            System.out.println("");
        }

        // outer loop bir deger aldıgında inner loop bastan sona calisir




    }
}
