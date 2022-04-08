package day20_scope_Arrays;

public class C02_StaticVariables {

    //instance variable'lar obje'ye bagimlidir ve her obje farkli degerler olabilir
    //ogrenci notlari veya ogretmen branslari gibi
    //bir objeye ait bir variables'in son degerini bulmak icin sadece o objeyi aliriz

    // static variablelar class variable olarak tanimanir ve tum class icin aynidir
    //okul ismi okul mudurunun adi gibi
    //eger static variablein degeri degistirilirse herkes icin degisir


    static String okulIsmi = "yildiz koleji ";
    static int okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {
        System.out.println(okulAcikMi);
        System.out.println(okulIsmi);

        okulNo=102;
        System.out.println(okulNo);
        System.out.println(okulAcikMi);

        staticMethod();
        System.out.println(okulNo);

    }
 public static void staticMethod(){
        okulNo=200;
     System.out.println(okulNo); //200

 }




}
