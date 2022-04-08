package day39_overriding;

public class Toyota extends Araba{
    //parenti araba

    String hiz="arabalar motor gucune gore hiz yaparlar";
    String marka="toyota";
    String sirketMerkezi="Japonya";

    public void motor(){
        System.out.println("toyota arabalar toyota marka motor kullanirlar");
    }

    public void garanti(){
        System.out.println("toyota araclar 10 yil garantilidir ");
    }
}
