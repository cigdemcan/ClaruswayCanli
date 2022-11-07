package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        // Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("int değer giriniz");
        int arr[]={1,2,3,4};
        int[]yeniArr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
          yeniArr[i]=arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
