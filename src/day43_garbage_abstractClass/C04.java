package day43_garbage_abstractClass;

public abstract class C04 {
    /*
    bir abstract class'da abstrcat veya concrete method'lar bulunabilir
    Child Class'larin abstract methodlari override etmesi MECBURIiken
                      concrete methodlarin override etmesi OPSIYONEL'dir.


     */
      public abstract void absmethod1();//body yok {}

    public void concreteMethod(){// mutlaka body olmali
        System.out.println("C04 concrete method");
    }

    public static void main(String[] args) {
      /*
        Abstract class'lar constraction'a sahiptir
        ancak abstract class'lardan obje olusturulamaz.

        Abstract class'lar OBJ BARINDIRMAYAN,
        sadece child class'lar icin
        UYULMASI SART OLAN veya OPSIYONEL birakilan
        ozellikleri tanimladigimiz bir depo class gibidir
        C04 obj= new C04();
       */
        System.out.println();// eksek kontrol et
    }
}
