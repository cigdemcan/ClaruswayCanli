package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
// TASK-> girilen bir tamsayı çiftse yarısını değilse "girilen sayı tek oldugu için yarısı tamsayı değildir"
      //  print eden code create ediniz.
         Scanner sc=new Scanner(System.in);
         System.out.println("agam bir sayı gir bakalım");
         int agaSayisi= sc.nextInt();
        System.out.println(agaSayisi % 2 == 0 ? agaSayisi / 2 : "girilen sayı tek oldugu için yarısı tamsayı değildir");
       // 2.yol
     // int sonuç = agaSayisi % 2 == 0 ? agaSayisi / 2 : "girilen sayı tek oldugu için yarısı tamsayı değildir");
        /*TRICK->Ternary iki durum için farklı data type çıktısı veriyorsa
        varible atama yapmadan sout yapmalı ya da ternary çıktısı aynı data type serializable edilmeli
         */
    }

}
