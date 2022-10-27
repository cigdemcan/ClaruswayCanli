package j22_DateTime.HaftanınSorusu;

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
}
