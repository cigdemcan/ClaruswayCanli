package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static <Kartvizit> void main(String[] args) {
           /*
        Task ->
         Key:isim ,email,adres,telefon
         Key'lere ait value'leri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz.
         */
        Map<String, String> nazımKrtvzt = new HashMap<>();
        nazımKrtvzt.put("isim", "Nazım");
        nazımKrtvzt.put("email", "ebik@gabık.com");
        nazımKrtvzt.put("adres", "buyuk dut agacını altı");
        nazımKrtvzt.put("telefon", "1453571622");

        Map<String, String> mehmetKrtvzt = new HashMap<>();
        mehmetKrtvzt.put("isim", "mehmet");
        mehmetKrtvzt.put("email", "ebik1@gabık1.com");
        mehmetKrtvzt.put("adres", "buyuk elma agacını altı");
        mehmetKrtvzt.put("telefon", "12345678");

        Map<String,Map<String, String>> kartvizit=new HashMap<>();
        kartvizit.put("QA Nazım",nazımKrtvzt);
        kartvizit.put("Dev Mehmet",mehmetKrtvzt);
        System.out.println("kartvizit = " + kartvizit);

        System.out.println("kartvizit.get(\"Dev Mehmet\").get(\"telefon\") = " + kartvizit.get("Dev Mehmet").get("telefon"));//12345678

        Map<Integer,Kartvizit> krt=new HashMap<>();
    //   Kartvizit k1= new Kartvizit("Enise","enise@tester.com","google company","1905");
    //    krt.put(k1.id, k1);
        System.out.println(krt);
     //   System.out.println("krt.get(k1.id) = " + krt.get(k1.id));
        System.out.println("krt.get(101) = " + krt.get(101));



    }
}
//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}