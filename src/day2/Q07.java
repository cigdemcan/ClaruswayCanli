package day2;

import java.util.Scanner;

public class Q07 {

  /*
        Problem tanimi :
        Kullanicidan  yasini ve kilosunu aliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
         */
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("yasınızı giriniz" );
      int yas=sc.nextInt();
      System.out.println("kilonuzu giriniz");
      int kilo=sc.nextInt();
      if(yas>0&& yas<18){
          System.out.println("yası 18`den küçük olanlar kan bagışı yapamaz ");
      } else if (yas>=18) {
          if(kilo>0&& kilo<50){
              System.out.println("kilonuz 50`den küçük olduğu için kan bağışı yapamaz");

          }else {
              System.out.println("kan bagışı yapabilirsiniz");
          }
      }
  }
}
