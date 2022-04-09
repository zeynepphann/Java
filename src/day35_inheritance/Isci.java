package day35_inheritance;

public class Isci extends Personel { //isci child personeli isci class'ina baglamaliyiz
    public static void main(String[] args) {

        Personel objPers= new Personel();
        objPers.isim="Eren";
        objPers.soyisim="Terzioglu";
        objPers.adres="Amsterdam";
        //isci olusturmadik personel olusturduk cunku personel cons. kullandik


        Isci objIsci= new Isci();
        objIsci.isim="Huseyin";
        objIsci.soyisim="Efe";
        objIsci.adres="Ankara";
        //isci cons kullanildi isci uretildi




    }
}
