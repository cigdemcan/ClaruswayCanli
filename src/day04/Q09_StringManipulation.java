package day04;

import java.util.Scanner;

public class Q09_StringManipulation {
    /*kullanıcıdan bir kelime girmesini isteyin
    sözcükte tek sayıda karakter ve 3veya daha fazla karakter içeriyorsa kelimenin
    ortasındaki karakteri yazdırınız*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String s=scan.nextLine();
        char ortancaKrk=s.charAt((s.length()-1)/2);
        if(s.length()%2==1&&s.length()>=3){
            System.out.println("ortanca karakter:"+ortancaKrk);
        }else System.out.println("tek sayıda karakter içereen bir kelime giriniz");

    }
}