package j22_DateTime.GirişProjesi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt {
    ArrayList<Kullanıcı>kullanıcıKişiler=new ArrayList<>();
   public  ArrayList<Kullanıcı> kayıtAl(){
       Scanner scanner=new Scanner(System.in);
       System.out.println("adınızı giriniz: ");
       String ad=scanner.nextLine();//kullanıcı obj için name alındı
       Kullanıcı k1=new Kullanıcı(ad, LocalDateTime.now());
       kullanıcıKişiler.add(k1);
return kullanıcıKişiler;
    }

    public void sanslıKullanıcı(ArrayList<Kullanıcı> kllObj) {
        for (Kullanıcı k:kllObj) {
            if (k.kayıtZamanı.getSecond()<=10){
                System.out.println(k.name);

        } {

        }
    }
}

    public void listele(ArrayList<Kullanıcı> kllObj) {
    }
