package j36_Map;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {
        HashMap<String ,String> hm=new HashMap<>();
        //map.putIfAbsent ();-:>Girilen key map de yoksa entry(key,value)map`e ekler ve null return eder
        //Girilen key map de varsa key`e ait value return eder


        hm.put("Amazon","296 Euro");
        hm.put("Ebay"," 234 euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put(" MediaMarkt","183 Euro");


        System.out.println("hm = "+ hm);//{Saturn=300 Euro, Ebay=234 Euro, Apple store=333 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}

        System.out.println("hm.putIfAbsent(\"ebık\",\"gabık\") = " + hm.putIfAbsent("ebık", "gabık"));//null
        System.out.println("hm.putIfAbsent(\"Ebay\",\"javaNaz\") = " + hm.putIfAbsent("Ebay", "javaNaz"));//234 Euro
        // Ebay key oldg için ebay key'e ait value 234 Euro return edildi
        System.out.println("hm = " + hm);//{ebik=gabık, Saturn=300 Euro, Ebay=234 Euro, Apple store=333 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}
    }
}
