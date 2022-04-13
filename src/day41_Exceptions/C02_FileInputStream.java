package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args) throws FileNotFoundException {
/*
     Bir kod yazilirken olasi exceptionlar ona gore on gorulup exception olustugunda javanin ne yapmasini istedigimiz belirtilmelidir

     1- Eger exception olustugunda kodun calismaya devam etmesini istemiyorsak
     method isminin yanina olusabilecek exceptionu declare edebiliriz

     2- Eger exception olussa da kodun calismaya devam etmesini istiyorsak
     sorun olusturabilecek kodu try catch blogunun icine alir
     try bloguna sorun cikabilecek kodu catch bloguna olusabilecek exception'i ve olasi
     exception durumunda Javanin ne yapmasini istedigimizi yazabilriz
 */
        String dosyaYolu="src/day41_Exceptions/dosya.txt";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
