package j35_Collection.C02_Set;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        /*
        deger ataması yapılan Array`i arraylıst `e ceviren method creata ediniz
        maın içerisinde return ettiği arraylıst`i hashSet, linkedHashSet ve TreeSett`e atayınız
         */
        String arr[] = {"muharrem", "umıt", "sınan", "nıhan"};
        arrayListeCevir(arr);
        HashSet<String> hs = new HashSet<>(arrayListeCevir(arr));
        LinkedHashSet<String> lhs = new LinkedHashSet<>(arrayListeCevir(arr));
        TreeSet<String> ts = new TreeSet<>((arrayListeCevir(arr)));

        System.out.println("hurra set: "+hs);
        System.out.println("erken gelen girer set: "+lhs);
        System.out.println("alfabetik sıra set: "+ts);

    }//maın sonu

    private static ArrayList<String> arrayListeCevir(String[] arr) {
     ArrayList<String>arList=new ArrayList<>(List.of(arr));
    return arList;
    }
}

