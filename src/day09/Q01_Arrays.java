package day09;

public class Q01_Arrays {
    public static void main(String[] args) {
        // type a method to check if an ınt ArraY is symmetrical or not
        int arr[] = {1, 2, 3, 2, 1};
        System.out.println(simetrikMİ(arr));
    }
    private static boolean simetrikMİ(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==arr[arr.length - 1 - i]) {
        flag=true;
            }else
                flag=false;
            break;}
       return flag;
       }}