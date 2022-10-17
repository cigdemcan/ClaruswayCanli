package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {

        // Task -> Kullanıcıdan alacagınız 5 adet sayıyı , giriş sırasına göre tersten print eden code create ediniz
        Scanner scanner=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i <5 ; i++) {
            System.out.println(i+" . index sayıyı giriniz: ");
            arr[i]=scanner.nextInt();
    }
        System.out.println(Arrays.toString(arr));
        int yeniArr[]=new int[5];
        for (int i = 0; i < 5; i++) {
            yeniArr[i]= arr.length-1-i;

        }
        System.out.println(Arrays.toString(yeniArr));
}}
