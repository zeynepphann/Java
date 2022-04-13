package day42_exception;

public class C02_Castexception {
    public static void main(String[] args) {
        int sayi=20;

        //string str=sayi ;CTE


         Object str3= "Java cok guzel";
         String str4= (String) str3;
        System.out.println(str4);


        Object sayi2=30;
        String str2=(String)sayi2; // Explicit Norrowing
                                   // object string barindirabilir fakat class cast exc. verir
                                   // yani RTE



    }
}
