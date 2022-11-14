package day04;

import java.util.Scanner;

public class Q13_StringManipulation {
    //kullanıcıdan 4 harfli bir kelime isteyin //ve girilen kelimeyi tersten yazdırın
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in) ;
        System.out.println("kelime giriniz");
        String kelime=scan.nextLine();
        System.out.println(kelime.length()>=4);
    }
}
