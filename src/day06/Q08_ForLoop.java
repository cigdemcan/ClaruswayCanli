package day06;

import java.util.Scanner;

public class Q08_ForLoop {
    //kullanıcıdan iki sayı isteyn
    //girilen sayılar ve aralarındaki tüm tamsayıları toplayıp sonucu yazdırınız
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayı1 = sc.nextInt();
        int sayı2 = sc.nextInt();
        int toplam = 0;
        int i;
        if (sayı1 < sayı2) {


            for (i = sayı1; i <= sayı2; i++) {
                toplam += i;
            }
            System.out.println(sayı1 + "ile" + sayı2 + "arasındaki sayıların toplamı:" + toplam);
        } else if (sayı1 > sayı2) {
            for (i = sayı2; i <= sayı1; i++) {
                toplam += i;
            }
            System.out.println(sayı1 + "ile" + sayı2 + "arasındaki sayıların toplamı:" + toplam);
        } else {
            System.out.println("sayılar esittir");
        }
    }
 /* Cuneyt bey den
        int sayi1 = scan.nextInt();
        int sayi2= scan.nextInt();
        int toplam=0;
        for (int i = (sayi1<sayi2 ? sayi1 : sayi2); i<= (sayi1>sayi2 ? sayi1 : sayi2); i++) {
            toplam+=i;
        }System.out.println("toplamları = " + toplam);
     */







}

