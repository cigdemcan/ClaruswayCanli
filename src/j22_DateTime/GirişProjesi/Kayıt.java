package j22_DateTime.GirişProjesi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayıt {
    ArrayList<Kullanıcı>kullanıcıKişiler=new ArrayList<>();
    //task 2.step
   public  ArrayList<Kullanıcı> kayıtAl(){//kullanıcı class `dan obj uretmek için cons.à gereken name ve kayıt zamanı
       //bilgilerini oluşturup obj lıstte ekler
       Scanner sc=new Scanner(System.in);
       System.out.println("adınızı giriniz: ");
       String ad=sc.nextLine();//kullanıcı obj için name alındı
       Kullanıcı k1=new Kullanıcı(ad, LocalDateTime.now());//k1 obj name kullanıcıdan kayıtZamanı LocalDateTime.now() olcak parametre
       kullanıcıKişiler.add(k1);//oluşturulan k1 lıst`e eklendi
return kullanıcıKişiler;//kullanıcıkişiler list`,i method cıktısı return olarak tanımlandı
    }
 //Task 3. step
    public void sanslıKullanıcı(ArrayList<Kullanıcı> kllObj) {//kullanıcı listesindeki obj`lerin kayıt zamanını 10 sn den
       //az olup olmamasına göre şanslı kullanıcı return edecek
        for (Kullanıcı k:kllObj) {//kullanıcı Class`tan kayıtAl() method ile uretilip kullanıcıKişi listìne eklenen
            //obj ler donguye alın
            if (k.kayıtZamanı.getSecond()<=10){//döngüye giren herbir kullanıcı obj sinin katıt zamanı datasındaki saniye verisi
                //10 dan kucuk olmasına bakıldı
                System.out.println(k.name+" agam sanslı kişisin 5 kg bal kazandın sisteme giriş zamanın " +k.kayıtZamanı);
            }else System.out.println(k.name+" agam sanslı kişideğilse kovan yagmalandı" +k.kayıtZamanı);

        }}
public void listele(ArrayList<Kullanıcı> kllObj){
    System.out.println(kllObj);//kullanıcı Class`daki toString print eder

}

}




