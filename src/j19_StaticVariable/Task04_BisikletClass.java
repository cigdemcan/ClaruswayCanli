package j19_StaticVariable;

import java.util.Scanner;

public class Task04_BisikletClass { /*
    Task 04->
     Bisiklet Class :Properties(fields) : hiz, vites
     method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */ Scanner scan = new Scanner(System.in);

    int hiz;
    int vites;
static  int seçim;
    public Task04_BisikletClass(int hız, int vites) {
        this.scan = scan;
        this.hiz = hız;
        this.vites = vites;
    }

    public Task04_BisikletClass() {

    }

    public void hizDegistir() {
        System.out.println("hizi giriniz: ");
        hiz = scan.nextInt();
    }
    public void vitesArttir() {
        vites++;
        if (vites > 5) {
            System.out.println("daha yüksek vites mevcut degil");
            vites = 5;
        }
    }

    public void vitesAzalt() {
        vites--;
        if (vites < 1) {
            System.out.println("daha dusuk vites mevcut degil");
            vites = 1;
        }

    }

    public void durumGoster() {
        System.out.println("vites = " + vites);
        System.out.println("hiz = " + hiz);
    }

    public void menu() {

        do {
            System.out.println("Lütfen islem seciniz: \n" +
                    "1 : Vites Azalt \n" +
                    "2 : Vites Yükselt \n" +
                    "3 : Yeni hiz gir \n" +
                    "4 : Durum göster \n" +
                    "5 : Cikmak icin 5 e basin");
            int seçim = scan.nextInt();
            switch (seçim) {
                case 1:
                    vitesAzalt();
                    break;
                case 2:
                    vitesArttir();
                    break;
                case 3:
                    hizDegistir();
                    break;
                case 4:
                    durumGoster();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("doğru değer giriniz");
            }
        }
        while (seçim != 5);

    }
     }