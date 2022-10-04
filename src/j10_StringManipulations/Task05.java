package j10_StringManipulations;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        //Girilen ad syad bilgilerinin ilk harflerini buyuk harf prınt eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("adınızı giriniz");
        String ad=sc.nextLine();
        System.out.println("soyadınızı giriniz");
        String soyad=sc.nextLine();
        System.out.println(ad.substring(0,1).toUpperCase()+ad.substring(1));
        System.out.println(" "+soyad.substring(0,1).toUpperCase()+soyad.substring(1));
    }
}
