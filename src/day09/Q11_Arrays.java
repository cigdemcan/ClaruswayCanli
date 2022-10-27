package day09;

import java.util.Arrays;
import java.util.Scanner;

public class Q11_Arrays {


    /*
    asagıdaki örnnekte olduÄŸu gibi 1 den 10 a kadar sayÄ±lar oluÅŸan dizide eksik olan sayÄ±yÄ± dÃ¶ndÃ¼ren metodu oluÅŸturunuz.

     ([1, 2, 3, 5, 6, 7, 8, 10,9])  4
    ([7, 2, 3, 10, 5, 9, 1, 4, 8])  6
    ([7, 5, 1, 2, 4, 6, 8, 3, 9])  10

     */
        static Scanner scan=new Scanner(System.in);
        public static void main(String[] args) {

            System.out.println("1 den 10 a kadar sayı giriniz :");
            int sayi1[]={1,2,3,4,5,6,7,8,9,10};
            int sayi2[]=new int[9];
            System.out.println(Arrays.toString(sayi2));

            girilenEksikSayiyiBulma(sayi1,sayi2);

        }
        public static void girilenEksikSayiyiBulma (int sayi1[],int sayi2[]) {
            for (int i = 0; i <9 ; i++) {
                sayi2[i]=scan.nextInt();
            }
            System.out.println(Arrays.toString(sayi2));
            int toplam=0;
            for (int i = 0; i <10 ; i++) {
                toplam += sayi2[i];

            }
            System.out.println("istenen sayımız: "+ Arrays.toString(sayi1));

            System.out.println("girdiğiniz eksik sayı: "+(55-toplam));
        }

    }

