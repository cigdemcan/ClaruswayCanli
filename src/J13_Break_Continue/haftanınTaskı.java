package J13_Break_Continue;

import java.util.Scanner;

public class haftanınTaskı {
  /*  Bir top belirli yÃ¼kseklikten atÄ±lmaktadÄ±r.
            AtÄ±ldÄ±ktan sonra, atÄ±ldÄ±ÄŸÄ± yÃ¼ksekliÄŸin 3/4 u kadar yerden yukarÄ± doÄŸru zÄ±plamaktadÄ±r
    Top zÄ±plama  yÃ¼ksekliÄŸi 1 metrenin altÄ±na indiÄŸinde durmaktadÄ±r.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayÄ±sÄ±nÄ± bulan do while code blogu create ediniz.

            */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("topun birakildigi ilk yuksekligi  giriniz : ");
        double yukseklik = scan.nextDouble();
        double topunToplamYolu=0;
        int yerevurmaSayisi=0;
        do {
            yerevurmaSayisi++;
            topunToplamYolu+=yukseklik;
            yukseklik*=(0.75);
            topunToplamYolu+=yukseklik;
        }
        while (yukseklik>=1);

        System.out.println("topun vurma sayisi:"+yerevurmaSayisi);
        System.out.println("topun aldigi toplam yol : "+topunToplamYolu);






    /*
     * Kullanicidan gelen datayi methodda parametre olarak alan
     * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
     */

        Scanner sc=new Scanner(System.in);


        System.out.println("pozitif tam sayi giriniz");
        int num = scan.nextInt();

        System.out.println(powersOfTwo(num));
        PowersofTwo(num);
    }
    public static boolean powersOfTwo(int num) {
        boolean powerOfTwo = false;
        for (int i = 1; i < Integer.MAX_VALUE; i = i * 2) {
            if (num == i) {
                powerOfTwo = true;
                break;
            }
            if (num < i) {
                break;
            }
        }
        return powerOfTwo;
    }
    private static void PowersofTwo(int num) {
        if (num % 2 == 0) {
            num /= 2;
            if (num == 1) {
                System.out.println("Girilen sayi 2'nin kuvvetidir");
            } else {
                PowersofTwo(num);
            }
        } else {
            System.out.println("Girilen sayi 2'nin kuvveti degildir");
        }


// tas > makas
// makas > kagit
//kagit > tas

        int numberOfFirstWin = 0;
        int numberOfSecondWin = 0;
        int numberOfComWin = 0;
        int gameOver = 3;

        Scanner scan = new Scanner(System.in);
        while (numberOfFirstWin < gameOver && numberOfComWin < gameOver) {
            System.out.println("1. Oynucu Secimi: \nTas secmek icin 0 \n Makas secmek icin 1 \n Kagit secmek icin 2 \n seciniz.");
            int myGuess = scan.nextInt();
            System.out.println("2. Oynucu Secimi: \nTas secmek icin 0 \n Makas secmek icin 1 \n Kagit secmek icin 2 \n seciniz.");

            int yourGuess = scan.nextInt();
            ;
            System.out.println("1. Oyuncu Tahmini:" + myGuess + "\n" + "2. Oyuncu Tahmini:" + yourGuess);

            if (myGuess == yourGuess) {
                System.out.println("Berabere");
            } else if ((myGuess == 0 && yourGuess == 1) || (myGuess == 1 && yourGuess == 2) || (myGuess == 2 && yourGuess == 0)) {
                System.out.println("1. oyuncu Kazandi");
                numberOfFirstWin++;
            } else {
                System.out.println("2. oyuncu Kazandi");
                numberOfComWin++;
            }

        }

        if (numberOfFirstWin == 3) {
            System.out.println("==GAME OVER==");
            System.out.println("Sizin kazandiniz: " + numberOfFirstWin);
            System.out.println("Kabettiniz Bilgisayarin kazanma sayisi: " + numberOfComWin);
        } else if (numberOfComWin == 3) {
            System.out.println("==GAME OVER==");
            System.out.println("Biligisayar kazandi: " + numberOfComWin);
            System.out.println("Kaybettiniz Kazandiginiz ouyn sayisi : " + numberOfFirstWin);
        }



    }}