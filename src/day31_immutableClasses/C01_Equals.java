package day31_immutableClasses;

public class C01_Equals {

    public static void main(String[] args) {

        String str1= "eren";
        String str2= "eren";


        String str3= new String("eren");

        String str4= str1+"";

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true


        System.out.println(str1==str2); //true
        System.out.println(str1==str3); //false
        System.out.println(str1==str4); //false


    }
}
