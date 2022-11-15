package J16_ArrayList;

import jdk.internal.jimage.ImageStrings;

import java.util.*;

public class deneme {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
        System.out.println(" lutfen arrayın boyutunu yanımlayınız");
        int arrSayı[]=new int[sc.nextInt()];
        int toplam=0;
        double ort=0;
        for (int i = 0; i < arrSayı.length; i++) {
            System.out.println(i+1);
            arrSayı[i]=sc.nextInt();
            toplam+=arrSayı[i];
            ort+=toplam/arrSayı.length;


        }
        System.out.println(ort);
        for (int i = 0; i < arrSayı.length; i++) {
            if (arrSayı[i]>ort){
                System.out.println(arrSayı[i]);

            }

        }

}}
