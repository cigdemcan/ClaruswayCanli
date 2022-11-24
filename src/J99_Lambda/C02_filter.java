package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_filter {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        System.out.println("\n ****   ");
        printCiftElStructyred(sayi);
        System.out.println("\n ****   ");
        printCiftElFunctional(sayi);
        System.out.println("\n ****   ");
        printCiftElFunctional1(sayi);
        System.out.println("\n ****   ");
        printCiftElFunctional2(sayi);


    }//maın sonu
    //Task : "Structured Programming":Amele code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printCiftElStructyred(List<Integer>sayi){
        for (Integer w:sayi){
            if (w%2==0){
                System.out.println(w +" ");
            }
        }
    }
    //Task : "Functional Programming":cincix code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printCiftElFunctional(List<Integer>sayi){
        sayi.stream().//list elemanları akışa alındı
                filter(t->t%2==0).//akıstakı list elemanlarını cift olma sartına gore fitrelendi: akıstan cıkarıldı
                forEach(C01_LambdaExpression::yazdır);//01 Class``dakı yazdır methodu refere( coll) edildi

    }
    public static void printCiftElFunctional1(List<Integer>sayi){
        sayi.stream().//list elemanları akışa alındı
                filter(C01_LambdaExpression::ciftMi).//akıstakı list elemanlarını cift olma sartına gore fitrelendi: akıstan cıkarıldı
                forEach(C01_LambdaExpression::yazdır);//01 Class``dakı yazdır methodu refere( coll) edildi

    }
    //Task : "Functional Programming":cincix code kullanarak list elemanlarının 35 den kucuk çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printCiftElFunctional2(List<Integer>sayi){
        sayi.stream().
                // filter(C01_LambdaExpression::ciftMi).
                 //filter(t->t<35)
                filter(t->t<35&& t%2==0).
                forEach(C01_LambdaExpression::yazdır);//01 Class``dakı yazdır methodu refere( coll) edildi

    }
    //Task : "Functional Programming":cincix code kullanarak list elemanlarının 34 den buyuk yada  çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
   public static void printCiftElFunctional3(List<Integer>sayi){
        sayi.stream().
                 filter(t->t%2==0||t<34).
                  forEach(C01_LambdaExpression::yazdır);//01 Class``dakı yazdır methodu refere( coll) edildi

    }
}
