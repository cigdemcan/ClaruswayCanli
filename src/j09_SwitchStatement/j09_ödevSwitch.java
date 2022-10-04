package j09_SwitchStatement;

import java.util.Locale;
import java.util.Scanner;

public class j09_ödevSwitch {
    public static void main(String[] args) {
        //TASK1->Girilen sayının onlar basamağının değerini yazı ile yazdırınız.
        Scanner sc=new Scanner(System.in);
        System.out.println("Sayi");
        int sayi= sc.nextInt();
        int sayı=(sayi/10)%10;

        switch (sayi){
            case 0:
                System.out.println("sıfır");
                break;
            case 1:
                System.out.println("bir");
                break;

            case 2:
                System.out.println("iki");
                break;

            case 3:
                System.out.println("üç");
                break;

               case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("yanlış sayı girdiniz");
        }
       //TASK2-> Kullanıcının yaşadığı güne göre 100 gün sonra hangi gün olduğunu yazdırınız
        //pazartesi hafta başlangıcı
      Scanner scan=new Scanner(System.in) ;
        System.out.println("pazartesi:1\n salı:2\n çarşamba:3\n perşembe:4\n cuma:5\n cumartesi:6\n pazar:7\n");
        System.out.println("haftanın kaçıncı gün olduğunu giriniz");
        int hangiGÜN =scan.nextInt();
        int kaçıncıGÜN=(hangiGÜN+100)%7;
        switch (hangiGÜN){
            case 1:
                System.out.println("pazartesi");
            break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;

            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 0:
                System.out.println("pazar");
                break;
            default:
                System.out.println("yanlış tercih yaptınız");
        }

         //task3->kullanıcının girdiği gün sayısına karşılık gelen gün adını giriniz


        Scanner gün=new Scanner(System.in);
        System.out.println("günAdı");
        int günAdı= sc.nextInt();
        switch (günAdı){

            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;

            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("yanlış tercih yaptınız");
        }

        //task->4 kullanıcı ay ismini girdiğinde o ayın kaç çektiğini ekrana yazdıran bir program yazınız

        Scanner  ay=new Scanner(System.in);
        System.out.println("bir ay adı giriniz");
       String ayADI= ay.next().toUpperCase();
        switch (ayADI){
            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case"ağustos":
            case "ekim":
            case "aralık":
                System.out.println("girilen ay 31 gün içerir");
                break;
            case "nisan":
            case"haziran":
            case "eylül":
            case "kasım":
                System.out.println("girilen ay 30 gün içerir");
                break;
            case "şubat":
                System.out.println("yılınızı giriniz");
                int yil = sc.nextInt();
                if (yil % 4 == 0) {

                    System.out.println("girilen ay 29 gün içerir");
                } else System.out.println("girilen ay 28 gün içerir ");
                break;
            default:
                System.out.println("yanliş tercih yaptınız");
        }

       //task5

        Scanner scn=new Scanner(System.in);
        System.out.println("Not giriniz");
        int not =scn.nextInt()/10;
        switch (not){
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          System.out.println("notun uz=D");
          break;
          case 5:
          System.out.println("notunuz=C");
          break;
          case 6:

          case7:
          System.out.println("notunuz =B");
          break;
          case 8:
          case 9:
         case 10:
            System.out.println("notunuz =A");
            break;
            default:
                System.out.println("hatalı giriş");








    }

}
    }