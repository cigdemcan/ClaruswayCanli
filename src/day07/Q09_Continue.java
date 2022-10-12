package day07;

import java.util.Scanner;

public class Q09_Continue { /*
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop’un bir sonraki değerinden devam eder.
     */
    // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String s=sc.nextLine();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='a' || s.charAt(i)==' ')continue;
            System.out.println(s.charAt(i));

        }
    }
}
