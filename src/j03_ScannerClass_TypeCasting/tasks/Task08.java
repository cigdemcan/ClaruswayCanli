package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("vize1 giriniz");
        int vize1=sc.nextInt();
        System.out.println("vize2 giriniz");
        int vize2=sc.nextInt();
        System.out.println("final giriniz");
        int final1=sc.nextInt();
       double ortalama=  (((vize1+vize2)*0.30)+(final1*0.70));
        System.out.println("ortalama = " + ortalama);

    }
}
