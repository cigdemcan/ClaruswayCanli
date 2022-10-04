package j04_AritmeticOperators;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz");

        int sayi =sc.nextInt();

        //1 ler basmağı-> bir sayının 10 bölümünden kalan 1 ler basmağıdır.
        int birler = sayi% 10;//sayının birler basamağı
        sayi/=10;// sayı 10 bölümünden bölümü verir 853/10->85
        int onlar= sayi% 10;//85 in 10 a bölümündenkalan->5
        int yüzler = sayi/10;//85 in 10 a bölümü->8

        System.out.println("Girdiğiniz sayının birler basamağı:"+birler+"lnGirdiğiniz sayının onlar basamağı:"+onlar+
         "lnGirdiginiz sayinin yuzler basamagi:"+yüzler);




    }
}
