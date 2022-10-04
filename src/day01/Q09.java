package day01;

import java.util.Scanner;

public class Q09 {
    //kullanıcıdan yarıçap isteyip çemberin çevresini ve dairenin alanını hesaplayıp yazdırınız(pi=3.14)
    Scanner sc=new Scanner(System.in);
    //kullanıcıdan ismini ve soyismini alip aralarında bir boşluk olşturarak aşagıdaki şekilde yazdırınız
    //isim -soyisim:Elly Dainty
    //kullanıcıdan ismini alıp ismin baş harfini yazdırın
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
           System.out.println("cemberin yaricapini girinz : ");
           double yaricap = scan.nextDouble();

           System.out.println("yaricap = " + yaricap);
           System.out.println("cemberin cevresi : " + 2*3.14*yaricap);
           System.out.println("dairenin alani : " + 3.14*yaricap*yaricap);
         System.out.println("lutfen isminizi giriniz : ");
         String isim = scan.nextLine();
      System.out.println("lutfen soyisminizi giriniz :");
        String soyIsim = scan.nextLine();
         System.out.println("isim -soyisim  :" + isim + " " +soyIsim );
        System.out.println("lutfen isminizi giriniz :");
        char ilkHarf = scan.next().charAt(0);
        System.out.println("girdiginiz ismin ilk harfi : " + ilkHarf);
    }
}



