package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class C08_limit {
    //limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.

    public static void main(String[] args) {
        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));
        System.out.println("\n     ******      ");
        charSayisiEnBuyuk(menu);
    }//maın sonu

    // Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void charSayisiEnBuyuk(List<String> menu) {
     Stream<String>enbykKrktr= menu.stream().sorted(Comparator.comparing(String::length).reversed()).
                limit(1);//akıştakı ilk 1 eleman alındı
        // System.out.println(enbykKrktr);//java.util.stream.SliceOps$1@2812cbfa->limit method bır stream yanı akıs return eder
        //dolayısıyla lımıt cıktısı dogrudan saut ıle prınt edilemez .Limit cıktısı  list veya array gibi bir collectiona atanmalı
        System.out.println(Arrays.toString(enbykKrktr.toArray()));



}}