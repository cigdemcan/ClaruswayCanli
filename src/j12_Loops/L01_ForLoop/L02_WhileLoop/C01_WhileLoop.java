package j12_Loops.L01_ForLoop.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*baslangıc ve bitiş degerleri net(bilinen degerler) olan tekrarlarda foor loop ama adım sayısı belli olmayıp bir şarta
        bağli olan tekrarlarda while loop kullanılmalı*/
        /*task01->11 den 20 ye kadar olan tamsayıları print eden code create ediniz*/
        System.out.println("for çözüm");
        for (int i = 11; i < 21; i++) {
            System.out.println(i + " ");
        }
        System.out.println("while cözumu");

        int basla = 11;//while baslangıç değeri
        while (basla < 21) {
            System.out.println(basla + " ");
            basla++;
        }

//task02-> 7 kere javaCAN print eden code create ediniz

        int b = 1;
        while (b < 8) {

            System.out.println(b + ". javaCAN");
            b++;
        }

        //2 basamaklı tek sayları yanyana prınt eden code create ediniz
       b=11;
        while (b<100){
         if (b%2==1)  System.out.println(b+" ");
             b++;
        }

     //  task04-> girilen metni tersten while loop ile code creata ediniz
        Scanner sc = new Scanner(System.in);
            System.out.println("bir metin giriniz");
        String metin = sc.nextLine();
        int metinUzunlugu=metin.length();
        while (metinUzunlugu>=1){//metnın son karakteri 0 a esit ve buyuk ıken
            System.out.print(metin.charAt(metinUzunlugu-1));
            metinUzunlugu--;

       //task05->girilen tamsayıya kadar tamsayıların toplamını print eden code create ediniz
            System.out.println("bir tamsayı giriniz");
            int sayı=sc.nextInt();
            int toplam=0;//dongu aksiyonundan oluşacak toplam için boş int oluşturuldu
            while (sayı>0){//sayı bır olana dek
                toplam+=sayı;//her dongude sayıyı 1 azalt ki dünya döndükçe donmesin
                sayı--;
            } System.out.println("agam girdiğin sayıların toplamı:"+toplam);



            //task06->girilen tamsayının faktoriyelini hesap eden code create ediniz
            int faktoriyel=1;
            while (sayı>0){
                faktoriyel *=sayı;
                sayı--;
            }
            System.out.println("girdiğin sayıların faktöriyeli"+faktoriyel);
    }}}
