package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        /*Ternary ile yapılan tüm işlemler if-else blok ile de yapılabilir
        ternary tercih edilmesi yapının basit okunur ve anlaşılabilir olması içindir ->clean code Ternary içerisinde komplex
        kodlar yerine doğrudan sonuç üreten veye sonucu veren daha basit code`lar bulunur,

         */
        //TASK01->girilen tam sayının tek-çift olmasını kontrol eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("agam bir sayı gir bakalım");
        int agaSayisi= sc.nextInt();
        System.out.println("   ****if-else****   ");
        if (agaSayisi%2==0) {
            System.out.println("agam sayi çift");
        } else System.out.println("agam syi tek");

        System.out.println("   ****   ternary   ****");
        //String sonuç =(agaSayisi%2==0 ? "agam sayi çift":"agam sayi tek");//komut çıktısı String type variable
       // System.out.println("sonuç = " + sonuç);
        System.out.println(agaSayisi % 2 == 0 ? "agam sayi çift" : "agam sayi tek");

        /*TRİCK->ternary operator işlem sonucunda true veya folse göre bir çıktı verir.
        eğer bu çıktı type göre bir varible atanmazsa sout ile doğrudan print edilmeli

         */

    }
}
