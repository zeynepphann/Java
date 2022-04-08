package day30_passByValue;

public class C01_StaticBlocks {
    static {
        System.out.println("static blok calisti"); // class calismaya baslamadan yapmamiz gereken son atamalar varsa onlari yapar
    }

    static {
        System.out.println("static block2 calisti"); // static blok birden fazla olursa bloklar yukaridan asagi
        //calisir
    }

    C01_StaticBlocks(){
        System.out.println("Constructor calisti"); // obje olusturmadigimiz icin calismadi
    }
    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();
    }


}
