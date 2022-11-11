package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _13_ArithmeticOperator_reminder3 {

    public static void main(String[] args) {

        /* Verilen iki int hakkında,
            num1'in num2'ye bölümünden kalanı yazdırınız.  */
        Scanner scan=new Scanner(System.in);

        System.out.println("2adet integer sayı giriniz");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int kalan=num1%num2;
        System.out.println("2 sayının bölümünden kalan:"+kalan);


    }
}
