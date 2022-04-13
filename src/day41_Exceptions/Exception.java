package day41_Exceptions;

public class Exception {
    public static void main(String[] args) {

        int a=10;
        int b=0;
        int c=0;

        try {
            c=a/b;
        } catch (java.lang.Exception e) {
            //burada yazdigimiz e javanin exceptionu atayacagi obje
            //exception ise olusan exceptionun turu

            //  e.printStackTrace();
            System.out.println(e.getMessage());// / by zero


        }
        System.out.println(c);
    }
}
