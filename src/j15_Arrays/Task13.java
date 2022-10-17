package j15_Arrays;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
        Scanner scanner=new Scanner(System.in);
        int arr[]=new int[8];
int ucebolen=0;
        for (int i = 0; i <8 ; i++) {
            System.out.println(i+" . index sayıyı giriniz: ");
            arr[i]=scanner.nextInt();
            if (arr[i]%3==0) {
                ucebolen++;
            }
    }
        System.out.println("3 e bolen sayı:"+ucebolen);
}}
