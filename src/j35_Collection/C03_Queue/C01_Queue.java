package j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        /*
        Queue collection interface old için child clss olan LinkedList ve PriorityQueue ile obj. uretilir.
        Eczane yemekhane vs belırlı sart ile aksiyon alan elemanlar için lkullanılır.
        cons.seçimine gore queue obj. ozellıkleri belırlenır.
        FİFO-> first in first out:ilk giren eleman ilk çıkar. eleman en sona ekle
         */
        Queue<String>q1=new LinkedList<>(Arrays.asList("Cebrail","Sumeyra","Yakup","Muharrem"));//[Cebrail, Sumeyra, Yakup, Muharrem]

        q1.add("Erol");
        System.out.println(q1);//[Cebrail, Sumeyra, Yakup, Muharrem, Erol]
        Queue<String>q2=new LinkedList<>(Arrays.asList("javacan","javasu","javanaz","javiye"));
        System.out.println("q2 = " + q2);//[javacan, javasu, javanaz, javiye]
        q2.add("java");
        System.out.println("q2 = " + q2);// [javacan, javasu, javanaz, javiye, java]

        System.out.println("q1.element() = " + q1.element());//Cebrail
        System.out.println("q1.peek() = " + q1.peek());//Cebrail
        System.out.println("q1.remove() = " + q1.remove());//Cebrail
        System.out.println("q1.poll() = " + q1.poll());// Sumeyra
        //peek()-> copt-paste gibi ilk elemanı return eder ama silmez
        //poll()-> cut-paste gibi ilk elemanı siler ve  return eder
        // element() -> ilk elemanı silmeden return eder.
        //remove() -> ilk elemnı siler ve return eder..

        //ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
        // poll ise null return eder.




       q1.clear();//queue coll. elemanları silindi
        System.out.println("q1 = " + q1);//[]
        System.out.println("q1.size() = " + q1.size());//0
        System.out.println("q1.poll() = " + q1.poll());//null
        System.out.println("q1.remove() = " + q1.remove());//hata verdi NoSuchElementException

        //offer()->queue coll. eleman eklemek için kullanılır
        System.out.println("q2.offer(\"küşleme\") = " + q2.offer("küşleme"));//true

/*
offer ve add farkı ->eger queue coll. eleman kısıtlaması yapılmıs ise add meth Exception fırlatır.
 offer ise true-false return eder
 */
    }
}
