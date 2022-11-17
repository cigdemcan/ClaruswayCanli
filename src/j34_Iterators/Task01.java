package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {
        /*
        task -> Verilen bir integer listin tek  elemanrının karesini tersten iteartor  print eden code create ediniz
         */
        List<Integer>liste=new ArrayList<>(Arrays.asList(1,3,4,8,6,9));
        System.out.println(liste);
        ListIterator<Integer>a1=liste.listIterator();
        while (a1.hasNext()){
            a1.next();
        }
        while (a1.hasPrevious()){
          int kare=  a1.previous();
            if(kare%2==1){
                kare*=kare;
                System.out.println("kare = " + kare);
                
            }
        }
    }
}
