package j36_Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Task07 {

    /*
    returnKey() isminde bir method oluşturun.
    Parametresi     String-Integer HashMap olsun.
    Return tipi Array List olsun.
    Hashmap:
                       "Lion",     1
                       "Tiger",    2
                       "Elephant", 3
                       "Cat",      4
                       "Dog",      5
    Tüm ANAHTARLARI(Keys) for döngüsü ile döndürün.
     */

    public static void main(String[] args) {

        HashMap<Integer, String> hv = new HashMap<>();
        hv.put(1, "Lion");
        hv.put(2, "Tiger");
        hv.put(3, "Elephant");
        hv.put(4, "Cat");
        hv.put(5, "Dog");


        System.out.println("returnKey(hv) = " + returnKey(hv));

    }

    private static ArrayList returnKey(HashMap<Integer, String> map) {
        ArrayList<String> list = new ArrayList<>();
        for (Integer w : map.keySet()) {
            list.add(String.valueOf(w));


        }
        return list;

    }

}
