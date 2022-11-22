package j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {
        /*
        Deque:Double Ended Queue ->Queue `larda FİFO Deque `lerde hem FİFO hem LİFO  gecerlı
        LİFO:Last in First out
         */
        Deque<String>dg1=new LinkedList<>(Arrays.asList("Küşleme","önkol","borek yatagı","ezme","haydari"));
        System.out.println("dg1 = " + dg1);
        dg1.add("humus");
        System.out.println("dg1 = " + dg1);//[Küşleme, önkol, börek yatagı, ezme, haydari, humus]

        System.out.println("dg1.getLast() = " + dg1.getLast());//humus
        System.out.println("dg1 = " + dg1);//[Küşleme, önkol, börek yatagı, ezme, haydari, humus]

        System.out.println("dg1.getFirst() = " + dg1.getFirst());//Küşleme
        System.out.println("dg1 = " + dg1);//[Küşleme, önkol, börek yatagı, ezme, haydari, humus]

        System.out.println("dg1.peekFirst() = " + dg1.peekFirst());//Küşleme
        System.out.println("dg1 = " + dg1);

        System.out.println("dg1.peekLast() = " + dg1.peekLast());;//humus
        System.out.println("dg1 = " + dg1);

        /*
        TRİCK->getFirst() method deque coll. boş ise NoSuElementExceptıon firlatır
        peekFirst() math.deque boşise null return eder.
         */
        dg1.clear();
        System.out.println("dg1 = " + dg1);

        System.out.println("dg1.peekFirst() = " + dg1.peekFirst());//null
      //  System.out.println("dg1.getLast() = " + dg1.getLast());//RTE :NoSuElementExceptıon
       // System.out.println("agam selametle app.run oldu devamke");



        Deque<String>dg2=new LinkedList<>(Arrays.asList("havuc dilimi","gullaç"," su muhallebi","triliçe","kazandibi"));
        System.out.println("dg2.pollFirst() = " + dg2.pollFirst());//havuc dilimi
        System.out.println("dg2.pollLast() = " + dg2.pollLast());//kazandibi
        System.out.println("dg2.removeFirst() = " + dg2.removeFirst());//gullaç
        System.out.println("dg2.removeLast() = " + dg2.removeLast());//triliçe
        System.out.println("agam selametle app.run oldu devamke");

        dg2.clear();
        System.out.println("dg2.pollFirst() = " + dg2.pollFirst());//null
        System.out.println("dg2.pollLast() = " + dg2.pollLast());//null
        System.out.println("dg2.removeFirst() = " + dg2.removeFirst());//NoSuchElementException
        System.out.println("dg2.removeLast() = " + dg2.removeLast());//NoSuchElementException
        System.out.println("agam selametle app.run oldu devamke");
    }
}
