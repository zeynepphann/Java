package day36_inheritance;

public class Muhasebe extends Personel{ //muhasebeyi parenta bagladim

    protected int saatUcreti;
    protected  String statu;
    protected int maas=8;


    protected int maasHesapla(){
        int maas=saatUcreti*8*30;
        return maas;
    }

}
