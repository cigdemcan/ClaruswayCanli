package day05;

import java.util.Scanner;

public class Q06_MethodCreation {
    /*kullanıcıdan isim ve soyismini alın ,
    kullanıcının ilk harflerini buyuk diğerlerini küçük yazdırın
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ilk isminizi giriniz");
        String ilkİsim = sc.next().toLowerCase();
        System.out.println("soyİsim giriniz");
        String soyİsim = sc.next().toLowerCase();

        isimYazma(ilkİsim, soyİsim);
        System.out.println("isimYazma2(ilkİsim,soyİsim)=" + isimYazma2(ilkİsim, soyİsim));


    }

    private static String isimYazma2(String ilkİsim, String soyİsim) {
        ilkİsim = ilkİsim.substring(0, 1).toUpperCase() + ilkİsim.substring(1);
        soyİsim = soyİsim.substring(0, 1).toUpperCase() + soyİsim.substring(1);
        System.out.println(ilkİsim + " " + soyİsim);
        return ilkİsim;
    }

        private static String isimYazma (String ilkİsim, String soyİsim){
            soyİsim = soyİsim.substring(0, 1).toUpperCase() + soyİsim.substring(1);
            ilkİsim = ilkİsim.substring(0, 1).toUpperCase() + ilkİsim.substring(1);
            return ilkİsim.concat(" " + soyİsim);

        }
    }
