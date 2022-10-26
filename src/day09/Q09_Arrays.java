package day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q09_Arrays {
    public static void main(String[] args) {

    /*
     If the list has 12 as element, change all 12s to 21
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */

        int multiArr [][] = {{1,3,6},{2,8},{5,7,9,14}};

        System.out.println("multidimensional arrayin cift elemanlari toplami = " + ciftElToplam(multiArr));

    }

    public static int ciftElToplam(int arr [][]) {

        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr[i].length ; j++) {
                if(arr[i][j] % 2 == 0) {
                    sum += arr[i][j];
                }
            }
        }

        return sum;
    }
}
