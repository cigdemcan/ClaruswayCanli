package j11_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        //task->girilen sayıdan 100 e kadar 4ün katı tam  tamsayıları print eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println(" pozitif tam sayı giriniz:");
        int sayı = sc.nextInt();
        if (sayı > 100) {
            System.out.println("agam hani 100 den küçük girecektin");
        } else {
            for (int i = sayı; i < 100; i++) {
                if(i%4==0){
                    System.out.println(i+" ");
                }
            }
        }
    }
}