package J11_MethodCreation;

import java.util.Scanner;

public class Tsak15UcusProject {/*
A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
Bilet tarifesi:
km birim fiyati : 0.10$
yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
12 ve 24 yas arasindaysa 10% indirim,
65 yasindan buyukse 30% indirim,
bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz */
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("javaAirlines e hoş geldin:)\n B C D rotasından birini seçiniz:");
        String rota=sc.next().toUpperCase();//rota verisi alındı
        System.out.println("ucus yönü için \n tek yon ->0\n çift yon ->1\n seçiniz");
        int uçuşYonu=sc.nextInt();//uçuş yönu tek çift alındı
        System.out.println("agam yasını gir");
        int yas=sc.nextInt();//yas verisi alındı

        double fiyatB=500*0.10;//A dan B ye uçuş fiyatı
        double fiyatC=700*0.10;//A dan C ye uçuş fiyatı
        double fiyatD=900*0.10;//A dan D ye uçuş fiyatı

        if(rota.equals("B")|| rota.equals("C")||rota.equals("D")) {//rota kontrolu yapıldı
            if (yas>65){
                if(rota.equals("B")){//rota B sartı
                    if(uçuşYonu==1) {//çift yön ucuş kontrolu
                        System.out.println(" 65 yas ustu B sehrine cift yon ucus toplam bilet fiyatı:" + (fiyatB * 0.7 * 0.8*2) + "$");
                    } else if (uçuşYonu==0) {
                        System.out.println("65 yas ustu B sehrine tek yon uçus bilet fiyatı"+(fiyatB*0.7)+"$");
                    }else System.out.println("agam yonun bellı degil");
                } else if (rota.equals("C")) {//rota C sartı
                    if(uçuşYonu==1) {//çift yön ucuşu
                        System.out.println(" 65 yas ustu C sehrine cift yon ucus toplam bilet fiyatı:" + (fiyatC * 0.7 * 0.8*2) + "$");
                    } else if (uçuşYonu==0) {
                        System.out.println("65 yas ustu C sehrine tek yon uçus bilet fiyatı"+(fiyatC*0.7)+"$");
                    }else System.out.println("agam yonun bellı degil");
                } else if (rota.equals("D")) {
                    if (uçuşYonu == 1) {//çift yön ucuşu
                        System.out.println(" 65 yas ustu D sehrine cift yon ucus toplam bilet fiyatı:" + (fiyatD * 0.7 * 0.8 * 2) + "$");
                    } else if (uçuşYonu == 0) {
                        System.out.println("65 yas ustu D sehrine tek yon uçus bilet fiyatı" + (fiyatD * 0.7) + "$");
                    } else System.out.println("yonun bellı degil");
                }else System.out.println("hatalı giriş yaptınız");


            } else if (yas<24 && yas>=12) {
                if(rota.equals("B")){//rota B sartı
                    if(uçuşYonu==1) {//çift yön ucuş kontrolu
                        System.out.println("12 24  yas arsı  B sehrine cift yon ucus toplam bilet fiyatı:" + (fiyatB * 0.9 * 0.8*2) + "$");
                    } else if (uçuşYonu==0) {
                        System.out.println("12 24 yas arsı B sehrine tek yon uçus bilet fiyatı"+(fiyatB*0.9)+"$");
                    }else System.out.println("agam yonun bellı degil");
                } else if (rota.equals("C")) {//rota C sartı
                    if(uçuşYonu==1) {//çift yön ucuşu
                        System.out.println(" 12 24 yas arası C sehrine cift yon ucus toplam bilet fiyatı:" + (fiyatC * 0.9 * 0.8*2) + "$");
                    } else if (uçuşYonu==0) {
                        System.out.println("12 24 yas arası C sehrine tek yon uçus bilet fiyatı"+(fiyatC*0.9)+"$");
                    }else System.out.println("agam yonun bellı degil");
                } else if (rota.equals("D")) {
                    if (uçuşYonu == 1) {//çift yön ucuşu
                        System.out.println(" 12 24 yas arası D sehrine cift yon ucus toplam bilet fiyatı:" + (fiyatD * 0.9 * 0.8 * 2) + "$");
                    } else if (uçuşYonu == 0) {
                        System.out.println("12 24 yas arası D sehrine tek yon uçus bilet fiyatı" + (fiyatD * 0.9) + "$");
                    } else System.out.println("yonun bellı degil");
                }else System.out.println("hatalı giriş yaptınız");


            } else if(yas<12) {
                if (rota.equals("B")) {//rota B sartı
                    if (uçuşYonu == 1) {//çift yön ucuş kontrolu
                        System.out.println("12 yas altı  B sehrine cift yon ucus toplam bilet fiyatı:" + (fiyatB * 0.5 * 0.8 * 2) + "$");
                    } else if (uçuşYonu == 0) {
                        System.out.println("12 yas altıB sehrine tek yon uçus bilet fiyatı" + (fiyatB * 0.5) + "$");
                    } else System.out.println("agam yonun bellı degil");
                } else if (rota.equals("C")) {//rota C sartı
                    if (uçuşYonu == 1) {//çift yön ucuşu
                        System.out.println("12 yas altı C sehrine cift yon ucus toplam bilet fiyatı:" + (fiyatC * 0.5 * 0.8 * 2) + "$");
                    } else if (uçuşYonu == 0) {
                        System.out.println("12 yas altı C sehrine tek yon uçus bilet fiyatı" + (fiyatC * 0.5) + "$");
                    } else System.out.println("agam yonun bellı degil");
                } else if (rota.equals("D")) {
                    if (uçuşYonu == 1) {//çift yön ucuşu
                        System.out.println(" 12yas altı D sehrine cift yon ucus toplam bilet fiyatı:" + (fiyatD * 0.5 * 0.8 * 2) + "$");
                    } else if (uçuşYonu == 0) {
                        System.out.println("12 yas altı D sehrine tek yon uçus bilet fiyatı" + (fiyatD * 0.5) + "$");
                    } else System.out.println("yonun bellı degil");
                } else System.out.println("hatalı giriş yaptınız");

            }else {//24 65 yas arsıindirim almayan yolcu grubu
                System.out.println("0 yas indirimi");
                if (rota.equals("B")) {//rota B sartı
                    if (uçuşYonu == 1) {//çift yön ucuş kontrolu
                        System.out.println("24 65  yas arsı  B sehrine cift yon ucus toplam bilet fiyatı:" + (fiyatB * 0.8 * 2) + "$");
                    } else if (uçuşYonu == 0) {
                        System.out.println("24 65 yas arsı B sehrine tek yon uçus bilet fiyatı" + (fiyatB) + "$");
                    } else System.out.println("agam yonun bellı degil");
                } else if (rota.equals("C")) {//rota C sartı
                    if (uçuşYonu == 1) {//çift yön ucuşu
                        System.out.println(" 24 65 yas arası C sehrine cift yon ucus toplam bilet fiyatı:" + (fiyatC * 0.8 * 2) + "$");
                    } else if (uçuşYonu == 0) {
                        System.out.println("24 65 yas arası C sehrine tek yon uçus bilet fiyatı" + (fiyatC) + "$");
                    } else System.out.println("agam yonun bellı degil");
                } else if (rota.equals("D")) {
                    if (uçuşYonu == 1) {//çift yön ucuşu
                        System.out.println(" 24 65 yas arası D sehrine cift yon ucus toplam bilet fiyatı:" + (fiyatD * 0.8 * 2) + "$");
                    } else if (uçuşYonu == 0) {
                        System.out.println("24 65 yas arası D sehrine tek yon uçus bilet fiyatı" + (fiyatD) + "$");
                    } else System.out.println("yonun bellı degil");
                } else System.out.println("hatalı giriş yaptınız");
            }
            }else System.out.println("yanlış rota girdiniz");//rota kontrol dışı durum




































    }
}
