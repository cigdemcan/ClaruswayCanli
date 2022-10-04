package j04_AritmeticOperators;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */

  Scanner sc=new Scanner(System.in);
  System.out.println("iki adet tam sayı girin");
  int num1= sc.nextInt();
  int num2= sc.nextInt();
  System.out.println(num1-num2);
    }
}
