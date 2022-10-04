package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /*Task01
        girilen bir sayının negatif ve pozitifliğini kontrol eden code creata ediniz.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz:");
         int sayi= sc.nextInt();
         if (sayi>0) {//sayının 0 dan buyuk olması şarta baglandı
             System.out.println("girilen say pozitif");
         }else if (sayi < 0) {//sayının 0 dan buyuk olmaması halınde 0 dan küçük olması şarta bağlandı
             System.out.println("girilen sayı negatif");
         }else {//sayının 0 dan büyük veya küçük olmaması halinde kalan durum(0 a eşit)şarta bağlandı
             System.out.println("girilen syı ne negatif ne pozitif yani nötr dür");
         }

             }
             }


