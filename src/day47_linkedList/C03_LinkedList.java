package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {
        Deque<Integer> ll1=new LinkedList<>();
        // System.out.println(ll1.element()); // bosken kullanirsak exception firlatiyor

        System.out.println(ll1.peek());  // bosken kullanirsak null dondurur
        System.out.println(ll1.poll()); // bastaki elementi getirir bossa null dondurur
        System.out.println(ll1.pollFirst());
        System.out.println(ll1.pollLast());
        // ll1.pop(); ilk elementi siler ve dondurur bos olursa expection firlatir

        ll1.push(30);//listenin basina ekleme yapar
        ll1.push(20);
        System.out.println(ll1);
        System.out.println(ll1.remove());

        ll1.remove();// ilk elemeneti siler ve dondurur bulamazsa excetions firlatir
        ll1.push(40);
        ll1.push(50);
        ll1.remove(50); // listte remove da 50 yazarsak index alir fakat burda sayiyi bulur ve siler
        ll1.push(30);
        System.out.println(ll1);
        ll1.removeLastOccurrence(30);
        System.out.println(ll1);





    }
}
