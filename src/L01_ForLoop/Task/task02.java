package L01_ForLoop.Task;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        /*girilen ifadenin polindrom olmasını kontrol eden code create ediniz
        polindrom=her iki yönde okudugunda esit olan ifadeler
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("bir metin  giriniz:");
        String str=sc.nextLine();
        polındrome(str);//string parametreli method coll



    }//main dışı

    private static void polındrome(String str) {
        String tersStr = "";//boş bir String kutu kulah
        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.charAt(i);//str nın i ci karekterini ters str ye ekler(concat)

        }
        System.out.println("girilen ifadenin tersi:" + tersStr);
        if (str.equalsIgnoreCase(tersStr)) {//str ile tersStr eşitlik kontrolu
            System.out.println("girilen ifade polındrome");
        } else System.out.println("girilen ifade polındrome değil");

    }
}
