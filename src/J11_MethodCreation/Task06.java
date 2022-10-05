package J11_MethodCreation;

import java.util.Locale;
import java.util.Scanner;

public class Task06 {


    static Scanner sc=new Scanner(System.in);
        /*
 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini
 ve iki sayı seçmesini söyleyin.
       Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
*/

    public static void main(String[] args) {



        System.out.println("kare, dikdörtgen ve üçgen birini seçiniz:");
        String seçim = sc.next().toLowerCase();
        System.out.println("1.syı giriniz");
        int sayi1=sc.nextInt();
        System.out.println("2.syı giriniz");
        int sayi2=sc.nextInt();
         secim(seçim, sayi1, sayi2);
    }
    public static void secim(String str,int sayi1,int sayi2){

        switch (str){
            case"kare":
                sayi2=sayi1;
                kareAlan( sayi2,sayi2);
                kareÇevre(sayi2, sayi2);
                break;
                case "dikdörtgen" :
                dikdörtgenAlanı(sayi1,sayi2);
                dikdörtgenÇevre(sayi1,sayi2);
                break;

                case "üçgen"  :
                sayi2=sayi1;
                üçgenAlanı(sayi1);
                üçgenÇevre(sayi1);
                break;

            default:
                System.out.println();

        }
    }
    private static void üçgenÇevre(int sayi1) {
        System.out.println("üçgen çevre"+(sayi1*3));
    }

    private static void üçgenAlanı(int sayi1) {
        System.out.println("üçgenin yuksekliğini giriniz");
        int yükseklik=sc.nextInt();
        System.out.println("üçgenin alanı:"+(sayi1*yükseklik)/2);

    }

    private static void dikdörtgenÇevre(int sayi1, int sayi2) {
        System.out.println("dikdörtgen cevresi:"+(sayi1+sayi2)*2);
    }

    private static void dikdörtgenAlanı(int sayi1, int sayi2) {
        System.out.println("dikdörtgen alanı"+(sayi1*sayi2));
    }

    private static void kareAlan(int sayi1, int sayi2) {
        System.out.println("kare alan:"+(sayi1*sayi2));
    }

    private static void kareÇevre(int sayi1, int sayi2) {
        System.out.println("kare çevre"+(sayi1*4));


    }


}
