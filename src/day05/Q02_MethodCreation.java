package day05;

import java.util.Scanner;

public class Q02_MethodCreation {
    /*write a method isEven that accepts an integer argumant.
    The method should return true if the argument is even ,or false otherwise.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı girirniz");
        int sayi=scan.nextInt();
        System.out.println(isEven(sayi));
    }

   public static boolean isEven(int sayi) {
        return sayi%2==0?true : false;
    }
}
