package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        //LIst'ten gelen ozellikleri biliyoruz
        //onun icin Deque'den gelen ozelliklere bakalim

        Deque <Integer>  ll1= new LinkedList<>();
        ll1.addFirst(10); // basa element ekler
        ll1.addLast(20); // sona element ekler
        System.out.println(ll1);
        System.out.println(ll1.element()); //ilk elementi silmeden bize dondurur
        System.out.println(ll1);

        System.out.println(ll1.getLast()); //son elementi getirir
        System.out.println(ll1.getFirst());//ilk elementi getirir

        ll1.offer(30);
        System.out.println(ll1);
        ll1.offerLast(40);
        System.out.println(ll1);
        ll1.offerFirst(50);
        System.out.println(ll1);

        System.out.println(ll1.peek()); //ilk elementi silmeden bize dondurur
                                        // bulamazsa null dondurur

        System.out.println(ll1.poll());


    }
}
