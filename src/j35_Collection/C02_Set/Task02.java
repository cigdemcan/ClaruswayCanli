package j35_Collection.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {
        //ınterview sorusu :girilen String datanın karakterlerini alfabetık prınt ediniz->TreeSet atanır
        //hashset ve tree set tanımlayıp run surelerini karsılastırınız
        //Trıck run suresı icin System.currentTimeMillis() meth call ediniz..
        long tsBasla=System.currentTimeMillis();//treeset run baslama zamanı alındı

        TreeSet<String>ts=new TreeSet<>();
        ts.add("salım");
        ts.add("koray");
        ts.add("haluk");
        ts.add("harun");
        ts.add("hasan");
        ts.add("hasmayan");
        ts.add("koray");

        long tsBitir=System.currentTimeMillis();//treeSET bıtıs zamanı alındı

        System.out.println("ts run suresi :"+(tsBitir-tsBasla));

        System.out.println("  ***  ");
        long hsBasla=System.currentTimeMillis();//hashset run baslama zamanı alındı
        HashSet<String>hs=new HashSet<>();
        hs.add("ebik");
        hs.add("gabık");
        hs.add("falan");
        hs.add("filan");
        hs.add("fesmekan");
        hs.add("agam");
        hs.add("bobrek Yatağı");
        hs.add("guvec");
        hs.add("kusleme");
        long hsBitir=System.currentTimeMillis();//treeSET bıtıs zamanı alındı
        System.out.println("hs run suresi :"+(hsBitir-hsBasla));

    }
}
