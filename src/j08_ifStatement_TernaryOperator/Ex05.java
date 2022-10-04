package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        /*TASK->girilren iki sayıyı seçilen dçrt işlemden birine uygulayıp sonucu pirint edencode create ediniz*/

        Scanner sc = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        double sayi1 = sc.nextDouble();
        System.out.println("2.sayı giriniz");
        double sayi2 = sc.nextDouble();
        System.out.println("+için ->1 seçiniz \n - için -<2 seçiniz <\n* için ->3 seçiniz\n /için ->4seçiniz");
        int seçim = sc.nextInt();
        if (seçim == 1) {
            System.out.println("toplama sonucu :" + sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
        } else if (seçim == 2) {
            System.out.println("çıkarma sonucu :" + sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
        } else if (seçim == 3) {
            System.out.println("çarpma sonucu :" + sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
        } else if (seçim == 4) {
            System.out.println("bölme sonucu :" + sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));
        } else System.out.println("agam ne istiyon adam akıllı bir şey gir işlemini yapalım");

    }

    }
