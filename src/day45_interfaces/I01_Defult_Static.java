package day45_interfaces;

public interface I01_Defult_Static {
    /*
    interfacelerde sadece abstract methodlar bulunur
    bodysi olan concrete bir method olusturmak istedigimizde
    java CTE verir

    Ancak java ve uzeri versiyonlarda, istisnai olarak static veya defult olarak tanimlanan
    methodlarin bodysi olabilir
    ancak burada kullanilan defoult access modifier degildir
    cunku interface'lerde tum methodlar public ve abstract'ti

    asagida i ornekte gorulecegi gibi defoult olarak tanimlanmis
    bir methoda access modifier olarak public yazabilirsiniz
    (access modifier yazmasak da java public olarak kabul edecektir)

     */

    void method1();

    public default void method2(){
        System.out.println("interfase'deki default method");

    }

    static void method3(){ // method3 ovirride edilemez cunku static
        System.out.println("interfase'deki static method");
    }







}
