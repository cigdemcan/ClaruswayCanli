package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

        Scanner sc=new Scanner(System.in);
        System.out.println("kilonuzu giriniz");
        byte kilo=sc.nextByte();
        System.out.println("kilo = " + kilo);



    }
}
