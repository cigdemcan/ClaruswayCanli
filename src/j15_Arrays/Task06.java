package j15_Arrays;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {

        // Task-> verilen bir int arrayi elemanlrÄ±nÄ± buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int[] sırala = new int[arr.length];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("buyukten kucuge sıralama: ");
        buyuktenKucugeSırala(arr);

        }
        private static void buyuktenKucugeSırala(int[] arr) {
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }}
