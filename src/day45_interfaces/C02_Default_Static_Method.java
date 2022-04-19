package day45_interfaces;

public class C02_Default_Static_Method implements I01_Defult_Static{
    /*
       Bir Interface'de default veya satatic olarak tanimlanan
       ve body'si olan methodlarin override edilmesi mecburu DEGILDIR

        */

    @Override
    public void method1() {
        System.out.println("child class method1");
    }
    /*
    Parent Interface'deki default olarak tanimlanan method'u
    istersek override ederiz istersek etmeyiz
    override etmezsek' method cagirildiginda Parent Interface'deki calisir
    override edersek, child class'daki overriding method calisir.

     */

    public static void main(String[] args) {
        //Interface de static olarak tanimlanan methodlara
        //static yontemlerle ulasilabilir InterfaceIsmi.MethodIsmi
        I01_Defult_Static.method3();

        C02_Default_Static_Method obj= new C02_Default_Static_Method();
        obj.method1();//child class'taki calisir
        obj.method2();//parent class

        //obj.method3(); eski class'larda static bir uyeye static olmayan yolllarla da
        //ulasabilirdik ancak interface icerisinde static olarak tanimlanan
        //method'a static olmayan yontemlerle ulasilamaz


    }
}
