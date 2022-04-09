package day39_overriding;

import day35_inheritance.Parent;

public class OverridingChild extends OverridingParent {
    /* bir obje olusturulurken data turu ve cons.ayni classtan secilmisse java
        direkt o classa gider hem variable hem de method icin o classta varsa kullanir yoksa o classin
        parentlarina bakar
         */
    public static void method1(){
        System.out.println("Child class method1");
    }
    // EKSIK VAR KONTROL ET
    public static void main(String[] args) {
        OverridingChild obj1= new OverridingChild();
        obj1.method1();// ilk basta child da olani calistirir   Child class method1
        //this.method1 cons ta olur                        Parent class method2
        obj1.method2(); // parenta gider ve calistirir

        OverridingParent obj3= new OverridingParent();
        obj3.method2(); //  Parent class method2
        obj3.method1(); //  Parent class method1


        /*
        eger data turu parent ve cons. Child class'dan seciliyse
        variable'larda yukaridaki sekilde calismaya devam eder
        ancak methodlar icin data turunun oldugu classdaki method Child class tarafindan
        OVERRIDE edilmis mi diye kontrol etmemiz gerekir
        eger Child classlarda bu method override edilmisse
        override eden method calisir
        */

        OverridingParent obj2= new OverridingChild();
        obj2.method2(); //  Parent class method2
        obj2.method1(); //  Child class method1




    }


}



