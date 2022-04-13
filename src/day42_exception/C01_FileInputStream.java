package day42_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) throws FileNotFoundException {

        String dosyaYolu="src/day41_Exceptions/dosya.txt";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k=0;
            while ((k=fis.read())!=-1){
                System.out.println((char)k);
            }

        } catch (FileNotFoundException e) { //bu daha dar
        e.printStackTrace();
        } catch (IOException e) {//bu daha genis
        e.printStackTrace();
    }
        /*
        Exception'lar icin de parent child iliskisi mevcuttur
        Eger bir kod icin birden fazla exc. olusma ihtimali varsa
        oncelikle olasi exc.' lar parent-child iliskisi tasiyor mu bakmamiz gerekir
        Eger parent child iliskisi yoksa, istedigimiz catch cumleleri olusturabiliriz
        Eger parent-child iliskisi varsa sadece parent exc.ini yazabiliriz veya
        ikisini de yazmak istersek childe,i once parenti sonra yazmaliyiz

         */

        /*
        Alti kirmizi cizili her kod CTE degildir
        Java syntax hatalarini derleme esnasinda(compile) farkeder ve altini cize
        biz bu gune kadar tamamina CTE diyorduk ancak
        exception konusu ile birlikte
        Compile Time Exception
         */

    }
}
