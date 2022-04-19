package day47_linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {
        Queue <Integer> ll1=new LinkedList<>();
        // System.out.println(ll1.element()); // bosken kullanirsak exception firlatiyor

        System.out.println(ll1.peek());  // bosken kullanirsak null dondurur
        System.out.println(ll1.poll()); // bastaki elementi getirir bossa null dondurur



    }
}
