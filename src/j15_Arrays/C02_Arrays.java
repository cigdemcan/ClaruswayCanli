package j15_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        //Array elemanı varlığını kontrol etme
        int arr[]={67,97,20,63,43,34,54,24,16,7,55,17};
        int sayi=33;
        boolean flag=false;//bayrak aşağıda
        for (int i = 0;  i<arr.length ;i++) {
            if(arr[i]==sayi){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("aradiginiz sayı array da var");
        }else {
            System.out.println("aradıgınız sayı array de yok");
        }
        Arrays.sort(arr);//array elemanları sıralandı
        System.out.println(Arrays.toString(arr));//[7,16,17,20,24,34,43,54,55,63,67,97]
        System.out.println(Arrays.binarySearch(arr,34));// 5 binarySearch(arr,34);-> method aranan elemanı arrayda arayıp index return eder
        System.out.println(Arrays.binarySearch(arr,99));// -13 binarySearch(arr,34);-> method aranan elemanı arrayda arayıp index return eder
        System.out.println(Arrays.binarySearch(arr,21));// -5 binarySearch(arr,34);-> method aranan elemanı arrayda arayıp index return eder

        //trick->binarySearch() methodu arrayda olmayan elemanı çalışırsa sonuç olarak bu eleman olsaydı kaçıncı sırada olurdu
    }
}
