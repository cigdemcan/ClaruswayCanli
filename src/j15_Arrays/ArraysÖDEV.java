package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysÖDEV {
    public static void main(String[] args) {


// Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz
      Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(i+". elemanını giriniz");
         arr[i]=sc.nextInt();
        }
        for (int i = 4; i >= 0 ; i--) {
        }
        int i = 0;
        System.out.println(arr[i]+" ");




/* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */




/*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */







/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java code create ediniz
			isAnagram("listen", "Silent") ==> true
		 */







            /*
             * Kullanıcıya sayı girmesini söyleyin. Kullanıcı sıfır girdiğinde,
             * ekrana o ana kadar girmiş olduğu
             * tüm sayıların toplamını yazdırınız.
             * Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın
             */







/* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */


        }}