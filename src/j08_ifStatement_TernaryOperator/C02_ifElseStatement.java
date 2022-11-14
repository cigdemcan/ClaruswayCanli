package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
        /*
        TASK-> girilen yasın 18 den buyuk
        luğunu kontrol eden code create ediniz
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("yasınızı giriniz");
        int yas = sc.nextInt();
       if (yas > 18) {
           System.out.println("yasınız 18 den buyuk");
        }
        /*TASK-> girilen yasın 18 den buyukluğunu kontrolen eden code creata ediniz
        18 den kucuk ise ehliyet alamazsınız print ediniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("yasınızı giriniz");
        int yas1 = sc.nextInt();
        if (yas1 > 18) {
            System.out.println("ehlıyet alabilirsiniz");
        }else System.out.println("ehliyet alamazsınız");

    }
}