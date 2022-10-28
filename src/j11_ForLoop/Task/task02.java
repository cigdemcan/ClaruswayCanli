package j11_ForLoop.Task;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        /*girilen ifadenin polindrom olmasını kontrol eden code create ediniz
        polindrom=her iki yönde okudugunda esit olan ifadeler
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("bir metin  giriniz:");
        String str = sc.nextLine();

        String str2="";
        for (int i = str.length()-1; i >= 0; i--) {
        str2 += str.charAt(i);}
        System.out.println(str.equals(str2));}}
//cıktısı ece true