package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        //task->iki string array elemanlarının ortak olmasını kontrol eden code create ediniz
        String arr1[] = {"nazım", "gulsum", "dilek", "erol", "cuneyt", "çiğdem"};
        String arr2[] = {"musty", "gulsum", "ayse", "enise", "cuneyt", "çiğdem"};
        List<String> ortIsım = new ArrayList<>();//ortak isimlerin atanacagı boş list
        for (String str1 : arr1) {
            for (String str2 : arr2) {
                if (str2.equalsIgnoreCase(str1)) {
                    ortIsım.add(str2);

                }
            }
        }
        if (ortIsım.isEmpty()) {
            System.out.println("arrayınzde ortak isim yok" + ortIsım);

        } else System.out.println(ortIsım);



    }
}
