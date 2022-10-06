package L01_ForLoop.Task;

import java.util.Scanner;

public class Task03_Faktoriyel {
    /* task->girilen sayının faktoriyelini hesaplayan method create ediniz
    sayı!=1*2*3*4*.....sayı
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("bir pozitif  tam sayı giriniz:");
        int sayı = sc.nextInt();
       faktorıyel(sayı);//int  parametreli method coll
    }//main dışı

    private static void faktorıyel(int sayı) {
        int faktorıyel=1;
        for (int i = 1; i <= sayı; i++) {
            faktorıyel *=i;

        }
        System.out.println("faktorıyel:"+faktorıyel);
    }
}