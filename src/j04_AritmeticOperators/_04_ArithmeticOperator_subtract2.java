package j04_AritmeticOperators;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */
 Scanner sc=new Scanner(System.in);
 System.out.println("dört adet sayı girin");
 int num1= sc.nextInt();
 int num2= sc.nextInt();
 int num3= sc.nextInt();
 int num4= sc.nextInt();
 System.out.println("dört sayının farkı:+(num1-num2-num3-num4)");

    }
}
