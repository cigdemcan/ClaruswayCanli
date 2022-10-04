package j08_ifStatement_TernaryOperator.day04;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {


        //kullanıcıdan ismini ve soyismini girmesini isteyin , sonrasında konsola tam ismini büyük harfler ile yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi ve soy isminizi girin");
        String firstName=scan.nextLine(),lastName=scan.nextLine();
        String fulName=firstName.concat(" "+lastName).toUpperCase();
        System.out.println("fulName="+fulName);
    }
}
