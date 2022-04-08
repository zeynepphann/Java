package day18_NestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {


        /*
       A
       A B
       A B C
       A B C D
       A B C D E
       A B C D E F
       şeklini yazdırınız.
       */
        
        char input ='F';

        for (char i = 'A'; i <=input ; i++) { // eger icerisi it olursa ascii degerleri ucgen seklınde yazdirir
            for (char j = 'A'; j <=i ; j++) {
                System.out.print(j + " ");

            }
            System.out.println("");
        }
        
        
    }
}
