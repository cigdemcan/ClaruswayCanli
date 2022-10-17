package j15_Arrays;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayin tek elemanlarını print eden code create ediniz.


 Scanner scanner=new Scanner(System.in);
        int arr[]=new int[7];
        for (int i = 0; i <7 ; i++) {
            System.out.println(i+" . index sayıyı giriniz: ");
            arr[i]=scanner.nextInt();

        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==1){
                System.out.print(arr[i]+",");
}}}}

