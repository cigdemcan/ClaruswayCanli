package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
        /*
  Kullanicidan aldigimiz 8 elemanli arrayin icinde
  kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
 */
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        int count=0;//3e bolunebilen eleman sayısı
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+". indexi giriniz :");
            arr[i]=sc.nextInt();
            if(i%3==0){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("count = " + count);
        }}