package day39_overriding;

public class Corolla extends Toyota{
    // parenti toyota

    protected String hiz="Corolla max 200km hiz yapar";
    protected String yakit =" Corolla benzinli veya elektiriklidir";
    protected String model="corolla";


    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanirlar");
    }

    public void yakitTuketimi(){
        System.out.println("corolla 5.6 lt yakit tuketir");
    }

    public void vitesSayisi(){
        System.out.println("corolla 5 viteslidir");
    }

    public static void main(String[] args) {
        //data turu ve cons. farkli old. cons. calistigi icin obj cons.in old.class ozelliklerini
        //tasir ancak data turu parent class secildigi icin
        //variablelar data turunun secildigi class ve onun parent
        //classlarindan deger alabilir

        // methodlar icin ise yine data turunun old. classa gideriz
        // ancak direk methodu calistirmadan once
        //method override edilmis mi diye kontrol ederiz
        // override= parent classda olan methodu child class da olusturmak demek

        Corolla arb1= new Corolla();
        System.out.println(arb1.hareket);//araba
        System.out.println(arb1.hiz);//corolla
        System.out.println(arb1.yakit);//corolla
        System.out.println(arb1.marka);// toyota
        System.out.println(arb1.sirketMerkezi);//toyota
        System.out.println(arb1.model);//corolla
        arb1.motor(); //corolla direk alir cunku motor var


        Toyota arb2 =new Corolla(); //direk toyotaya gider data turu toyota
        System.out.println(arb2.hareket);//araba
        System.out.println(arb2.hiz);//toyota
        System.out.println(arb2.yakit);//araba
        System.out.println(arb2.marka);// toyota
        System.out.println(arb2.sirketMerkezi);//toyota
        //System.out.println(arb2.model);//CTE
        arb2.motor();// corolla
        arb2.garanti();// toyota
        arb2.yakitTuketimi(); // corolla
        //arb2.vitesSayisi(); calismaz => once data turune gider toyota => vites sayisi yok
        // onunda parentina gider (arabaya) ve bulamaz o yuzden calismaz. Override edilmemis
        //(mehmet hocanin) Data turu olan toyotadan baslayinca
        //boyle bir method bulamadik o yuzden CTE

        Araba arb3 =new Corolla();
        System.out.println(arb3.hareket);//araba
        System.out.println(arb3.hiz);//corolla
        System.out.println(arb3.yakit);//corolla
        System.out.println(arb3.marka);// toyota
        //System.out.println(arb3.sirketMerkezi);//toyota CTE
        //System.out.println(arb3.model);//corolla CTE

        arb3.yakitTuketimi(); // once bulur sonra kontrol toyotaya bakar
        // edilmemis sonra corolla kismina gelir
        // yakitTuketimine corolla da bakar ve corolladakini calistirir
        arb3.motor();// motoru arabada buldu sonra toyotaya gitti override edilmis suan toyotadaki
        //motor methodunu ele aliyoruz sonra corolla da var mi diye kontrol ediyoruz ve motor methodu oldugu icin
        // corolla'dakini yazdirir
        //arb3.garanti(); CTE armaya araba classindan basladi ve methodu bulamadi
        // arb3.vitesSayisi(); bulamadi ve CTE



    }
}
