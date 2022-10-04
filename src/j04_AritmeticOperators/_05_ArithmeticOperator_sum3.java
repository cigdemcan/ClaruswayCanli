package j04_AritmeticOperators;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {


          /*    kullanıcıdan alınan 3 tane int
         toplamını print eden code create ediniz. */
    Scanner sc=new Scanner(System.in);
    System.out.println("üç adet sayı giriniz");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int num3=sc.nextInt();
    System.out.println("girmiş oldugunuz sayıların toplamı="+ (num1+num2+num3));
    }
}
