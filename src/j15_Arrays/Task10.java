package j15_Arrays;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
        bir int Array elemanlarinin işaaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
int arr[]={1,2,3,-4,-5};
işretDeğiştir(arr);
    }
    private static void işretDeğiştir(int[] arr) {
      //  for (int i = 0; i < arr.length; i++) {
       //     arr[i]=-1*arr[i];
      //  }
     //   System.out.println(Arrays.toString(arr));
        for (int i:arr) {
            i=i*(-1);
            System.out.print("i = " + i);
            
        }
    }
}
