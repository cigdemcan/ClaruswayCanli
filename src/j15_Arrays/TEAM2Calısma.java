package j15_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TEAM2Calısma {
    /* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
    public static void main(String[] args) {

        int arr[] = {2, 6, 4, 5, 8, 9};
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i] * arr[i];

        }
        Arrays.toString(arr1);

      /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        Scanner sc =new Scanner(System.in);
        System.out.println("kac elemanlı sayı gırmek istersin");
        int arr2[]=new int[sc.nextInt()];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(i + ". elemanı gırınız");
            arr2[i]= sc.nextInt();

        }
        System.out.println("Arrays.toString(arr2[i]) = " + Arrays.toString(arr2));

        int arrToplam=0;
        for (int i = 0; i < arr2.length; i++) {
            arrToplam += arr2[i];

        }
        System.out.println("arrToplam = " + arrToplam);
        int ortalama=arrToplam/arr2.length;
        int ortgecen=0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]>arrToplam){
                ortgecen++;
            }
            System.out.println("ortgecen = " + ortgecen);
        }
        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.

        ArrayList<Integer> listSayi = new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));
        Scanner scan=new Scanner(System.in);
        System.out.print("agam hangi sayı arirsen :");
        int ara=sc.nextInt();
        boolean varMi=false;

        for (int i = 0; i < listSayi.size(); i++) {
            if (listSayi.get(i) == ara) {
                varMi = true;
                System.out.println("agam aradıgın sayı bizde MEVCUT :)");
                break;
            }
        }
        if (!varMi) {
            System.out.println("agam aradıgın sayı MAALESEF :(");
        }

    }
}

