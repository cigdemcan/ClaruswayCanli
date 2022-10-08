package day05;

import java.util.Scanner;

public class Q08_MethodCreation {
    /*kullanıcı taraafından girilen bir tılın artık yıl olup olmadığını kontrol etmek için
    bir java metodu yazınız
    test data:      2017 2000 2022
    beklenen çiktı: false true true
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("bir yıl girin");
        int yıl=sc.nextInt();
        System.out.println(artikYılMi(yıl));
    }

    private static boolean artikYılMi(int yıl) {
        return (yıl%400==0 ||(yıl%4==0 &&yıl%100==0));
    }
}
