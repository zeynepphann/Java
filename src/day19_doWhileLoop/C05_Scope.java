package day19_doWhileLoop;

public class C05_Scope {

    // 1- bir method icinde olusturulan variablelar sadece olusturulduklari
    //method da kullanilabilirler  baska methodlaeda kullanilmaz
    // 2- tum methodlararin kullanabilmesini istedigimiz variablelari
    //class levelda olusturulur
    //class level yaparsak tum methodlar kullanabilir
    //--- static yaparsak tum methodlar kullanabilir
    //--- static olmazsa (instance ) o zaman sadece static olmayan methodlar kullanabilir
    // 3-loop icinde olusturulan variablelar loop icerisinde kullanilabilir
    // ama loopun disinda kullanilamaz


    static String kurs = " java ";
    int level=10;

    public static void main(String[] args) {


        int sayi= 10;
        System.out.println(kurs);
       // System.out.println(level); static degil
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);

        }
       // System.out.println(i); kullanilmaz
       // loopSayi=30; kullanilmaz
    }

    public static void method1 (){
        System.out.println(kurs);
        // System.out.println(level); static degil

    }

    public void method2 (){
        System.out.println(kurs);
        System.out.println(level);

    }
}
