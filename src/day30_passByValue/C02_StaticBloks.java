package day30_passByValue;

public class C02_StaticBloks {
    /*

    static olmayan bloklar ise obj olusturulurken clisir

    static bloklar sadece 1 kere en basta calisir ama
    static olmayan bloklar her obj olusturulurken yeniden calisir
     */
    {
        System.out.println("static olmayan blok calisti");
    }


    static {
        System.out.println("static blok calisti");
    }


    public static void main(String[] args) {

        System.out.println("main method basi");

        C02_StaticBloks obj1= new C02_StaticBloks();
        C02_StaticBloks obj2= new C02_StaticBloks();


    }
}



