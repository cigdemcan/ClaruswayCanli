package day01;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        //kullanıcıdan 2 tam sayı alın
        //bu tam sayıları toplayın ve sonucu yazdırın
        Scanner sc = new Scanner(System.in);
        System.out.println("birinci sayıyı yazdırınız");
        int sayi1 = sc.nextInt();
        System.out.println("ikinci sayıyı yazdırınız");
        int sayi2 = sc.nextInt();
        int sum = sayi1 + sayi2;
        System.out.println("sum = " + sum);
    }
}
