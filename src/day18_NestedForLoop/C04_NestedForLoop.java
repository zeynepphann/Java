package day18_NestedForLoop;

public class C04_NestedForLoop {

    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */


        int input = 5;

        // SATİR SAYİSİ İNPUT


        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= i; j++) { // eger aouter loopu i ye baglarsak sutunlar i kadar olur

                System.out.print("* ");

            }
            System.out.println("");

        }

        for (int i = 1; i <= input-1; i++) { // ve buradaki input -1

            for (int j = 1; j <= input-i; j++) { // tek yapilan degisiklik i degil input-i yazmak
                System.out.print("* ");

            }
            System.out.println("");
        }




    }
}
