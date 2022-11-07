package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.
      /*  Scanner sc = new Scanner(System.in);

        System.out.print("agam kaç elemanlı array istirsen : ");
        //int arrBoyut = sc.nextInt();

        int arr[] = new int[sc.nextInt()];//boyutu belirlenmiş boş int array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ". index  elemanı giriniz : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("agam istedgin array : " + Arrays.toString(arr));
        int arrToplam = 0;//local var.


     //   for (int i = 0; i < arr.length; i++) {
     //       arrToplam += arr[i];
     //   }
     //   System.out.println("array eleman toplamları : "+arrToplam);
        for (int i:arr) {
            arrToplam+=i;
            System.out.println("arrToplam = " + arrToplam);

        }*/


        Scanner sc=new Scanner(System.in);
        System.out.println("kacelemanlı array istıyorsun");
        int sayı=sc.nextInt();
        int arr[]=new int[sayı];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i +". elemanını giriniz");
            arr[i]=sc.nextInt();}
            System.out.println(Arrays.toString(arr));
            int arrToplam=0;
            for (int j = 0; j < arr.length; j++) {
                arrToplam +=arr[j];}
        System.out.println(arrToplam);


            }

        }


