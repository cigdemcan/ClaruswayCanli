package day07;

public class Q04_NestedForLoop { /*  Problem Tanımı
    Girilen bir sayı kadar satır ve sütünu olan ve
    sağ kenara dayalı üçgeni basan kodu yazınız.

    Ekran Çıktısı
    Bir sayi giriniz: 5
           *
          **
         ***
        ****
       ***** */
    public static void main(String[] args) {
        for (int satır = 1; satır <=5 ; satır++) {
            for (int bosluk = 5-satır; bosluk >0 ; bosluk--) {//boşluk kontrolu
                System.out.print(" ");
            }
            for (int sutun = 1; sutun <=satır ; sutun++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
