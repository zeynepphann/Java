package day39_overriding;

public class Araba {
   protected String  hareket="arabalar teker ile hareket eder";
   protected String hiz="arabalar motor gucune gore hiz yaparlar";
   protected String yakit =" arablar farkli yakitlar kullanabilir";
   protected String marka="arabalar uretildikleri markaya sahiptir";


    public void motor(){

        System.out.println("arabalar farkli markalarda motor kullanirlar");
    }

    public void yakitTuketimi(){

        System.out.println("arabalar motor gucu ve yakit turune gore yakit tuketirler");
    }
}
