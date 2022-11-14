package day04;

import java.util.Scanner;

public class Q11_StringManipulation {
    //kullanıcıdan isim ve soyismini girmesini isteyin ve hangisinin daha uzun olduğunu yazdırın
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in) ;
        System.out.println("isim giriniz");
        String isim=scan.nextLine();
        System.out.println("soyisim giriniz");
        String soyisim=scan.nextLine();
        if(isim.length()>soyisim.length()){
            System.out.println("isim daha buyuk");
        }else
            System.out.println("soyisim daha buyuk");
    }
}
