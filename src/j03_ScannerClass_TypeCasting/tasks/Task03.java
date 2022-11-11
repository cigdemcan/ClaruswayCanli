package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("gunde kac saat uyudugunuzu giriniz");
        int saat=sc.nextInt();
        int ay=saat*30;
        int yıl=saat*365;
        int kırkYıl=saat*365*40;
        System.out.println(ay + kırkYıl +yıl);
    }
}
