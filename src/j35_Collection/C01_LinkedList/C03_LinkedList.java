package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("javacan","ebubekır","gulsum","ebubekır","adem","ilker","javacan","merve"));
        //Linkedlist remove()...ilk node silinir ve silinen node sipariş verilir
        System.out.println(ll1);//[javacan, ebubekır, gulsum, ebubekır, adem, ilker, javacan, merve]
        System.out.println(ll1.remove());//javacan
        System.out.println(ll1);//[ebubekır, gulsum, ebubekır, adem, ilker, javacan, merve]

        ll1.remove(3);//Adem->silinen node return eder
        System.out.println(ll1);//[Ebubekir, Gülsüm, Ebubekir, İlker, javaCAN, Merve]

        System.out.println(ll1.remove("merve"));//true
        System.out.println(ll1.remove("javatar"));//false->olmayan node false olan node true return eder
        System.out.println(ll1);//[ebubekır, gulsum, ebubekır, ilker, javacan]

        System.out.println(ll1.removeFirstOccurrence("ebubekır"));//true
        System.out.println(ll1);//[gulsum, ebubekır, ilker, javacan]

        System.out.println(ll1.element());//ilk node return eder->gulsum

        LinkedList<String>ll2=new LinkedList<>(Arrays.asList("javacan","ebubekır","gulsum","ebubekır","adem","ilker","javacan","merve"));
        LinkedList<String>ll3=new LinkedList<>(Arrays.asList("hasan","harun","haluk","hasmayan"));
        ll2.addAll(ll3);
        System.out.println(ll2);//[javacan, ebubekır, gulsum, ebubekır, adem, ilker, javacan, merve, hasan, harun, haluk, hasmayan]
        System.out.println(ll2.removeAll(ll3));//true
        System.out.println(ll3.remove(ll2));//false
        System.out.println(ll2);
        // LinkedList get() getFirst() getLast()..girilen index ve ilk son node return eder
        System.out.println(ll2.get(2));//gulsum
        System.out.println(ll2.getFirst());//javacan
        System.out.println(ll3.getLast());//hasmayan


        List<Integer> ll4 = new LinkedList<>(Arrays.asList(1,3,4,6,7,54,34,45));
        System.out.println("ll4 = " + ll4);
        ll4.remove(3);// remove() method'unun icine integer yazılırsa  eleman değil index olarak tanımanır .
        //Burada index'i 3 olan 6 silinir.
        //remove() method'unun icinde olmayan bir index kullanirsaniz
        //Java IndexOutOfBoundsException throw eder
        //ll1.remove(33);

    }
}
