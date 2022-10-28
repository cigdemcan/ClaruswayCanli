package j11_ForLoop.Task;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /* girilen 5 sayının 10 ile 20 arası hariç diğerlerinin toplamını hesap eden code create ediniz*/
        Scanner sc = new Scanner(System.in);

        int toplam=0;//ilk değeri 0 olan  toplama etki etmeyecekveriable
        for (int i = 1; i <=5; i++) {
            System.out.print(i+".sayıyı giriniz");
            int sayı= sc.nextInt();
            if (sayı<=10||sayı>=20){
                toplam+=sayı;
            }//if sonu
        }//for sonu

        System.out.println("girdiğiniz sayının istenen şartta toplamı:"+toplam);



    }

}
