package J16_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

      //girilen sayıların içinde ortalamadan buyuk olanları print eden code create ediiniz
        Scanner sc=new Scanner(System.in);
        System.out.println(" lutfen arrayın boyutunu yanımlayınız");
        int arrSayı[]=new int[sc.nextInt()];
        double ort=0;
       int toplam=0;

        for (int i = 0; i < arrSayı.length; i++) {
            System.out.print("Lutfen arrayin (" + (i + 1) + "). elemanini tanimlayiniz: ");
            arrSayı[i] = sc.nextInt();

            toplam += arrSayı[i];
            ort+=toplam/arrSayı.length;

        }
        System.out.println("ort = " + ort);
        System.out.println("ortalama ustu sayılar : ");
        for (int i = 0; i < arrSayı.length; i++) {
            if ((arrSayı[i]>ort)){
                System.out.println("arrSayı = " + arrSayı[i]);
            }

        }





    }
}
