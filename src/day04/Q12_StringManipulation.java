package day04;

import java.util.Scanner;

public class Q12_StringManipulation {
    //kullanıcıdan alacağınız bir stringde boşluk karekterinin olup olmadığını kontrol ediniz
    //kullanıcıdan alacağınız bir stringin boş olup olmadığını kontrol ediniz
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz");//java öğren
        String a=scan.nextLine();
        boolean boşlukVarmı=a.contains(" ");
        System.out.println("boşlukVarmı = " + boşlukVarmı);//true
    }
    }
   /* 2.yol
   int boşluk=str.indexOf(" ");
   if(boşluk==-1 && str.isEmpty())
   System.out.println("sartlara uygun");
  else System.out.println("sartlara uygun değildir");

    */