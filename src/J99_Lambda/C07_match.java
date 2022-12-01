package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_match {
    public static void main(String[] args) {

        List<String > menu = new ArrayList<String>(Arrays.asList("küşleme","küşleme","küşleme","soğanlı","soğanlı","soğanlı","trileçe","bicibici","büryan","melemen","cacix","kokerç","yağlama","güveç","arabAşı","tantuni"));
        System.out.println("\n   ****   " );
        hrfSys7DenAzKontrol(menu);
        System.out.println("\n   ****   " );
        wBasla(menu);
        System.out.println("\n   ****   " );
        eBiten(menu);
    }//maın sonu


    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

    //task:List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public  static void hrfSys7DenAzKontrol( List<String > menu){
      boolean kontrol= menu.stream().allMatch(t->t.length()<=7);
      if (kontrol){
          System.out.println("agam menudeki 7 ve daha az karaktreden olusuyor :)");
      }else System.out.println("agam menudekıler 7 karakterden fazla");
      //cıcıx code
        System.out.println(  menu.stream().allMatch(t->t.length()<=7)?"agam menudeki 7 ve daha az karaktreden olusuyor" :"agam menudekıler 7 karakterden fazla");



    }
    //Task-> List elelmanlarinin "W" ile baslamasını kontrol ediniz.
    public static void wBasla( List<String > menu){
        System.out.println(menu.stream().noneMatch(t -> t.toLowerCase().startsWith("w"))//akıştaki hiç bır eleman w ile baslamaz
                ? "agam w ile baslayan yemek olur mu"//sart true ise print eder
                : "agam wenemen ne menem bır sey");//sart false ise print eder
    }
    //Task-> List elelmanlarinin "x" ile biten en az bir elemanını kontrol ediniz.
    public static void eBiten( List<String > menu){
        System.out.println(menu.stream().anyMatch(t -> t.toLowerCase().startsWith("x"))//akıştakien az bir eleman x ile biter kontrol yapıldı
                ? "agam senden bir cacıx olmaz"//sart true ise print eder
                : "agam senın yemek bu topraklarda yok");//sart false ise print eder
    }
}

