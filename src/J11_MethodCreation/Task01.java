package J11_MethodCreation;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task->girilen iki sayının eşitliğini kontrol eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int sayı1 = sc.nextInt();

        System.out.println("2. sayıyı giriniz");
        int sayı2 = sc.nextInt();

        System.out.println(esitKontrol(sayı1,sayı2));//true-false

        System.out.println(esitKontrol(33, 33));//true
        System.out.println(esitKontrol2(56, 67));//sayılar esit degil
        System.out.println(esitKontrol2(61, 61));//sayılar esit
        System.out.println(esitKontrol2(sayı1, sayı2));//?

    }//main sonu




    private static boolean esitKontrol(int sayı1, int sayı2) {
        boolean eşitMi = false;
        if (sayı1 == sayı2) {
            eşitMi = true;
        } else eşitMi = false;


        return eşitMi;


    }
    public static boolean esitKontrol2(int a, int b) {
        if (a == b) {
            System.out.println("sayılar esit");


        } else System.out.println("sayılar esit degil");
return false;
    }
}