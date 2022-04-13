package day43_garbage_abstractClass;

public abstract class  C03_IlkAbstractClass {

    public abstract void AbstractMethod();
    /*
     Abstract method'lar child class'larin MUTLAKA
     Overrid etmesi gereken methodlardir
     dolayisiyla hic bir zaman direkt calistirilmazlar ve bu sebeple method
     body'sine ihtiyac yoktur.

     Bir class'in veya method'un Abstract olup olmadigini anlayabilir miyiz?
    -abstract yaziyorsa abstract'dir yazmiyorsa degildir.
    (abstract olmayan class'lara concrete class/method denir.)

    Abstract method'lar body'e sahip olamaz concrete methodlar
    ise method body'si olmadan olusturulamaz.
     */
}
