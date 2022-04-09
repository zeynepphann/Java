package day40_overriding_polymorphism;

public class C04_Exceptions {

    //String olarak verilen bir sayiyi , Integera cevirip 2 katini
    // ekranda yazdiralim
    public static void main(String[] args) {

        String str="1234a";

        //int sayi = Integer.parseInt(str); // stringi integera cevirdik

        // sayi olmayan bir karakter olursa
        // NumberFormatException.forInputString

        //System.out.println("girilen sayinin 2 kati : " + 2* sayi);

        //try yaz ctrl alt t yap

        try {
            int sayi = Integer.parseInt(str);
            System.out.println("girilen sayinin 2 kati : " + 2*sayi);
        } catch (Exception e) {
           // e.printStackTrace();// exceptionla karsilasirsan rapor ver
            System.out.println("girdiginiz string, sayi olmayan elemanlar iceriyor");
        }



    }

}
