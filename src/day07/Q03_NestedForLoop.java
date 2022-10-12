package day07;

import java.util.Scanner;

public class Q03_NestedForLoop { /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("bir sayı giriniz");
        int sayı = sc.nextInt();
        int count=0;//sayac tek olan sayıları sayan değişken
        while (sayı > 0) {
            if (sayı % 2 == 1) {
                System.out.print(sayı+ " ");
                count++;
            }
            sayı--;
        }
        System.out.println();
        System.out.println("count="+count);
    }
}