package day20_scope_Arrays;

public class C01_Scope {

    //instance scope
    int sayi;
    String okulIsmi= " Java";
    boolean okuldaMı;


    public static void main(String[] args) {

        // sayi=10 ; sayi variablesi static olmadigi icin main method'dan direkt kullanilamaz
        // intance variablelara static methodlardan ulasabilmek icin obje olusturmaniz gerekir

        C01_Scope obj1= new C01_Scope(); // bu classin bir objesi
                                         // ögretmenin brani
        System.out.println(obj1.sayi); //0 deger atmadigimiz icin java otomatik 0 atiyor
        obj1.sayi=10;
        System.out.println(obj1.sayi); //10

        C01_Scope obj2= new C01_Scope();
        System.out.println(obj2); // 0





    }
}
