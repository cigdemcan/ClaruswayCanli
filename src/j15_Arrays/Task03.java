package j15_Arrays;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        	 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

int arr[]={1,2,3};
int Yeniarr[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i==0){
                Yeniarr[i]=arr[i+1];
            }else if(i==Yeniarr.length-1) {
                Yeniarr[i]=arr[0];
            }else {Yeniarr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(Yeniarr));
    }
}}
