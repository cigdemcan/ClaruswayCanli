package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_map {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        ciftKarePrint(sayi);

        System.out.println("sayi = " + sayi);


        System.out.println("\n ****   ");

        tekKupBirFazlaPrint(sayi);

        System.out.println("\n ****   ");

        cıftKarekokPrint(sayi);
    }//maın sonu

    //Task : "Functional Programming ile listin cift  elemanlarının karelerini aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void ciftKarePrint(List<Integer> sayi) {
        sayi.stream().
                filter(C01_LambdaExpression::ciftMi).//akıstakı cıt elemanlar filtrelendi
                map(t -> t * t).//akısta filtrelenen cift elemanlar karesi alınarak update edildi akısa sokuldu
                forEach(C01_LambdaExpression::yazdır);//akısta filtrelenmiş cift elemanlar karsı alınıp işaretlenen akıstan prınt edildi
   //map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.
    }

    //Task : "Functional Programming ile listin tek  elemanlarının kuplerinin bır fazlası  aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void tekKupBirFazlaPrint(List<Integer> sayi) {

        sayi.stream().
                filter(t->t%2==1).
               // map(t -> t * t * t + 1).
                       map(t->(int)Math.pow(t,3)+1).
                forEach(C01_LambdaExpression::yazdır);
    }
    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void cıftKarekokPrint(List<Integer> sayi) {

        sayi.stream().
                filter(C01_LambdaExpression::ciftMi).

               //         map(Math::sqrt).
               // forEach(t->System.out.print(t+" "));
                       //2.yol
                       map(t->(int)Math.sqrt(t)).
                forEach(C01_LambdaExpression::yazdır);

    }
}