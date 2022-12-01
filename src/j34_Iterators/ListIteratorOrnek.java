package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorOrnek {
    public static void main(String[] args) {
        List<String> Team2 = new ArrayList<>(Arrays.asList("Çağla", "Simten", "Ercan", "Gürsoy", "Abdülaziz", "Nurcan", "Taha"));
        ListIterator<String> t = Team2.listIterator();
        while (t.hasNext()) {
            String name = t.next();
            if (!name.startsWith("Ç")) {
                System.out.println("name = " + name);
            } else t.remove();

        }
        System.out.println("Team2 = " + Team2);// [Simten, Ercan, Gürsoy, Abdülaziz, Nurcan, Taha]

        System.out.println("     ****      ");
        //task->listenın elemanlarından sonra gulen yuz :-) ekleyelım
        List<String> l = new ArrayList<>(Arrays.asList("baran", "gülsüm", "akif", "nazım"));
        ListIterator<String> liste = l.listIterator();
        System.out.println("ıterator oncesi liste :" + l);//[baran, gülsüm, akif, nazım]
        while (!liste.hasNext()) {
           String s= liste.next();
         if (liste.hasNext()){
             liste.set(s + ":-)");

           }

        }
        System.out.println("iterator sonrası lıste = " + l);//[baran, gülsüm, akif, nazım:-)]
    }
}