package j09_SwitchStatement;

import java.util.Locale;
import java.util.Scanner;

public class j09_ödevSwitch {
    public static void main(String[] args) {
       /*
      TASK :
      Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
      1. 0(dahil) ile 50 arasi - D
      2. 50(dahil) ile 60 arası - C
      3. 60(dahil) ile 80 arası - B
      4. 80(dahil) ustu- A
      Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

      AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
      switch() de int, byte, short, char, String kullanilir.

       */
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





/*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */

            /*    Scanner scan = new Scanner(System.in);
                System.out.println("***** seyahat şirketimize hos geldiniz *****");
                System.out.println("Frankfurt : 60 km \nKoln : 80\n 20 Km basına 5 euro ucretlendirme yapılır :) ");
                System.out.print("yolculuk yapacagınız sehri seciniz : ");
                String hedef = scan.next().toUpperCase();//sehir buyuk harfe update edildi
                double bakiye=100;
                double Frankfurt=(80/20)*5;
                double koln=(60/20)*5;

                switch (hedef){
                    case "FRANKFURT":
                        System.out.println("kac kısı gıdeceksınız");
                        int kısısayısı= scan.nextInt();
                        System.out.println(Frankfurt);

                        switch (kısısayısı){
                            case 1:
                                System.out.println("1 kısılık bılet tıtarınız" + Frankfurt);
                                System.out.println("kalan bakıyenız :" +(bakiye-Frankfurt));
                                break;
                            case 2:
                                System.out.println("2 kısılık bılet tıtarınız" + (Frankfurt*2));
                                System.out.println("kalan bakıyenız :" +(bakiye-(Frankfurt*2)));
                                break;
                            default:
                                System.out.println("en fazla ıkı kısı gıdebılırsınız");
                                break;
                        }
                    case "KOLN":
                        System.out.println("kac kısı gıdeceksınız");
                        int kısı= scan.nextInt();
                        System.out.println(koln);

                        switch (kısı){
                            case 1:
                                System.out.println("1 kısılık bılet tıtarınız" + koln);
                                System.out.println("kalan bakıyenız :" +(bakiye-koln));
                                break;
                            case 2:
                                System.out.println("2 kısılık bılet tıtarınız" + (koln*2));
                                System.out.println("kalan bakıyenız :" +(bakiye-(koln*2)));
                                break;
                            default:
                                System.out.println("en fazla ıkı kısı gıdebılırsınız");
                                break;
                        }
                        break;
                    default:
                        System.out.println("koln veya frankfurta gıdebılırsınız");
                        break;

                }*/
        }



    }

}
