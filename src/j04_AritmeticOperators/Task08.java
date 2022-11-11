package j04_AritmeticOperators;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
int input=4250;
int saat1=4250/3600;
int saniye=4250%60;
int dakıka=(4250-(50+3600))/60;
        System.out.println(input+" saniye" +saat1 +"saat"+dakıka+"dakika"+saniye+"saniye");
    }
}