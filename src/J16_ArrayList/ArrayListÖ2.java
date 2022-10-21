package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListÖ2 {
    public static void main(String[] args) {

  //TASK01 ArrayListteki bir değerin bir kac kez tekrarlamasını belirtın
        ArrayList<String> meyveler = new ArrayList<>(List.of("Orange", "Kiwi", "Peach", "Banana", "Orange"));
        System.out.println("meyve kac tane:" + getCount(meyveler, "Orange"));

//TASK02->ArrayList teki tum sayıları toplayınız
        ArrayList<Integer> sayılar = new ArrayList<>(List.of(1, 2, 24, 46, 8));
        System.out.println("toplam :" + getSum(sayılar));

//TASK03->ArrayList`in içindeki her bir Stringin uzunluğunu bulan code create ediniz
        ArrayList<String> kelimeler = new ArrayList<>(List.of("New jersey", "New york", "Ohio", "Florida", "Boston"));
        uzunluk(kelimeler);
        System.out.println(uzunluk(kelimeler));

//TASK04->ArrayList`teki s1`i s2 olarak değiştiriniz
        ArrayList<String> renkler = new ArrayList<>(List.of("yellow", "red", "blue", "red", "blue"));
        String s1 = "yellow";
        String s2 = "blue";
        System.out.println(ArrayListDeğiştir(renkler, s1, s2));



}private static int getCount(ArrayList<String> a, String Orange) {
        int count = 0;
        for (String value : a) {
            count += value.contains(Orange) ? 1 : 0;
        }
        return count;
    }
    private static int getSum(ArrayList<Integer> sayılar) {
        int toplam = 0;
        for (int value : sayılar) {
            toplam += value;
        }
        return toplam;

    }

    private static ArrayList<Integer> uzunluk(ArrayList<String> kelimeler) {
        ArrayList<Integer> list = new ArrayList<>();
        for (String uzunluk : kelimeler) {
            list.add(uzunluk.length());
        }
        return list;


    }private static ArrayList<String> ArrayListDeğiştir(ArrayList<String> renkler, String blue, String yellow) {
        ArrayList<String> list = new ArrayList<>();
        for (String a : renkler){
            list.add(a ==blue? yellow:a);

        }return list;

    }}











