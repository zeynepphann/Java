package day40_overriding_polymorphism;

import java.util.concurrent.Callable;

public class C02 extends C01{

    // sag klik generete override  tiklayinca geliyor
    @Override
    public void method2() {
        /*
        override notasyonu overridden method ile overriding method'u
        birbirine baglar
        Farkinda olunmadan overriden method silinirse veya signature degistirilirse
        bu iliski bozulacagi icin java CTE verir

        Notasyon kullanilmazsa java bunlari iliskisini bilir
        ama overridden method silinirse sesini cikarmaz
         */
        System.out.println("child method 2");
    }

    public static void main(String[] args) {
        C02 obj = new C02();

        obj.meyhod1(); // parent method1
        obj.method2(); // child method2

        C01 obj2= new C02(); // sol taraf data turu
                             // sag taraftaki constractera gelip override edilmis mi diye kontrol edecek
        obj2.meyhod1();//parent method1
        obj2.method2();// child method2

        C01 obj3= new C01();
        obj3.meyhod1();// parent method1
        obj3.method2();// parent method2

    }
}
