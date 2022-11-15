package J16_ArrayList;


import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListÖDEV {


    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım :  c adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 	6.adım		 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */
 /* static ArrayList<String> gunler = new ArrayList<String>(List.of("pazartesi ", "salı ", "çarşamba ", "perşembe ", "cuma ", "cumartesi ", "pazar "));
    static ArrayList<Integer> gunlukKazanc = new ArrayList<>();
    static int toplamKazanc = 0;
    static int ortalamaKazanc = 0;

    public static void main(String[] args) {
        int index = 0;
        while (index < 7) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Lutfen " + gunler.get(index) + " gununun kazancını giriniz:");
            int kazanc = sc.nextInt();
            gunlukKazanc.add(index, kazanc);
            toplamKazanc += kazanc;
            index++;
        }
        System.out.println("ortalama kazancın" + getOrtalamaKazanc());
        System.out.println("ortalamanın ustunde kazandıgınız gunler " + getOrtalamanınUstundekiGunler());
        System.out.println("ortalamnın altında kazandıgınız gunler " + getOrtalamaninAltindaKazancGünleri());
    }

    private static String getOrtalamaninAltindaKazancGünleri() {
        String altgunler = "";
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (gunlukKazanc.get(i) < ortalamaKazanc) {
                altgunler += gunler.get(i);
            }
        }
        return altgunler;
    }

    private static String getOrtalamanınUstundekiGunler() {
        String ustgunler = "";
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (gunlukKazanc.get(i) > ortalamaKazanc) {
                ustgunler += gunler.get(i);
            }
        }
        return ustgunler;
    }

    public static int getOrtalamaKazanc() {
        ortalamaKazanc = toplamKazanc / gunler.size();
        return ortalamaKazanc;
    }










/* Task-> girilen değere göre  salyangoz matris  create eden code create ediniz
        input :3
        output:
                1       2       3
                8       9       4
                7       6       5

         input :4
         output :
                1       2       3       4
                12      13      14      5
                11      16      15      6
                10      9       8       7
         */

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Slayangoz matrisin boyutunu giriniz");
        int boyut = sc.nextInt();
        int max = boyut;
        int satır = 0;
        int sutun = -1;
        int geciş = 1;
        int value = 1;
        int[][] matris = new int[boyut][boyut];
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < max; j++) {
                sutun += geciş;
                matris[satır][sutun] = value++;

            }
            max--;
            for (int j = 0; j < max; j++) {
                satır += geciş;
                matris[satır][sutun] = value++;
            }
            geciş *= -1;
        }
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();

        }


    }









}