package day18_NestedForLoop;

public class C03_NestedForLoop {

    public static void main(String[] args) {

        // Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //      *
        //      * *
        //      * * *
        //      * * * *
        
         int input =5;


        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= i; j++) { // eger aouter loopu i ye baglarsak sutunlar i kadar olur

                //  nested for loop ya dikdortgen veya ucgen formatinda olabilir
                // dikdortgen istedigimizde iki loop icin de bagimsiz en point belirleriz
                 // ucgen sekli vermek icin inner loop un end pointini alarak outer degirkene baglariz

                System.out.print("* ");

            }
            System.out.println("");
        }

    }
}
