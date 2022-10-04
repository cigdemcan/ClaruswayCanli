package j10_StringManipulations;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /*Girilen Stringin son karekterini silen code create ediniz*/
        Scanner sc=new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str=sc.next();
        System.out.println(str.substring(0,str.length()-1));





    }
}
