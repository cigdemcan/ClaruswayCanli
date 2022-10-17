package j12_Loops;

import java.util.Scanner;

public class C03_WhileLopp {
    public static void main(String[] args) {
        //task->girilen tam sayının tam bolen sayısını print eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("agam bır tam sayı giriniz");
        int sayı = sc.nextInt();
        int bolenSayı = 1;
        int tamBolenAdedi = 0;
        while (bolenSayı <= sayı) {
            if (sayı % bolenSayı == 0) {//sayı bolen sayıya tam bolunuyor
                tamBolenAdedi++;
            }
            bolenSayı++;//loop sonsuza düşmemesi için ve diğer sayıların boldüğü kontrol edilmesi için
        }
        System.out.println("agam girdiğin "+sayı+"nın"+tamBolenAdedi+"kadar tam boleni var)");
    }
}