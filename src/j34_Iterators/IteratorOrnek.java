package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorOrnek {
    public static void main(String[] args) {
        ArrayList<String>isimler=new ArrayList<>(Arrays.asList("Fatih","Nursena","Hakan"));
        System.out.println("isimler = " + isimler);
        Iterator<String>liste= isimler.iterator();

       while (liste.hasNext()){//eleman var mı boolean retorn

           liste.next();

           liste.remove();
           System.out.println("isimler = " + isimler);

       }

    }
}
