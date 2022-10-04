package j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplamı {
    public static void main(String[] args) {

        //kullanıcıdan alınan 3 basamaklı bir sayını rakamları toplamını print eden code create ediniz
        Scanner sc= new Scanner(System.in);
        System.out.println();

        int sayi= sc.nextInt();
        //1 ler basmağı-> bir sayının 10 bölümünden kalan 1 ler basmağıdır.
        int birler = sayi% 10;//sayının birler basamağı
        sayi/=10;// sayı 10 bölümünden bölümü verir 853/10->85
        int onlar= sayi% 10;//85 in 10 a bölümündenkalan->5
        int yüzler = sayi/10;//85 in 10 a bölümü->8
        int rakamToplamı=birler+onlar+yüzler;
        System.out.println("rakamToplamı="+rakamToplamı);

    }
}
