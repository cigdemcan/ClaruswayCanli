package j23_Varargs_StringBuılder.StringBuilder;

import java.util.Locale;

public class C02_StringBuilder {
    public static void main(String[] args) {
        //StringBuilder obj create etme
        //1.yol
        StringBuilder sb1 = new StringBuilder();//default capacity 16 bit olan value`su olmayan boş
        System.out.println("sb1.length() = " + sb1.length());//0
        System.out.println(sb1.capacity());//capacity 16 bit

        sb1.append("JAVATAR");//JAVATAR sb1`e eklendi
        System.out.println("sb1 = " + sb1);
        System.out.println(sb1.capacity());//capacity 16 bit

        sb1.append(" selam ").append("olsun").append(" ").append(24).append(" ").append(true);
        System.out.println("sb1 = " + sb1);
        System.out.println(sb1.capacity());//capacity 34 bit oncekinin 2katı +2 fazlası

        sb1.append("basarı gayrete aşıktır :) ");
        System.out.println("sb1 = " + sb1);
        System.out.println(sb1.capacity());//70
        //2.yol
        StringBuilder sb2 = new StringBuilder("fatih beye selamlar");//ilk değer ataması yapılmış sb1 StringBuilder obj
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());//35

        //trim()-> fazladan ayrılan capacity silinir
        System.out.println("sb2.length() = " + sb2.length());
        sb2.trimToSize();//19
        System.out.println("sb2.capacity() = " + sb2.capacity());//19

        //3.yol
        StringBuilder sb3 = new StringBuilder(11);//hafızada 11 karakterlik yer ayıran boş sb tanımlandı
        System.out.println("sb3.length() = " + sb3.length());//boş sb3 karakter sayısı :0
        System.out.println("sb3.capacity() = " + sb3.capacity());//11
        sb3.append("ebubekir bey");
        System.out.println("sb3.capacity() = " + sb3.capacity());//24

        //istenen bir caharacter index`i alma
        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));//m

        //belirli bir aralıktaki karakterleri alma


        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13));//3,4,5,6,7,8,9,10,11,12 indexi verir :atar selam
        System.out.println("sb1.substring(17) = " + sb1.substring(17));//17 den sonraki tüm karakterler
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));//3,4,5,6,7,8,9,10,11,12 indexi verir

        //belirli bir index deki karacteri silmek
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3));
        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7));//3,4,5,6. karakterleri siler

        //istenen karakter veya karakterleri eklemek
        System.out.println("sb3.insert(4,\":)\") = " + sb3.insert(4, ":)"));
        String s="guzel insan";
        System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));
        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));//eel ibub:)ekir bey ->sb3 valuesini 1.indexine

        //istenen index deki karakteri değiştirme

        StringBuilder sb4=new StringBuilder("Nihan Hanım");
        sb4.setCharAt(4,' ');
        System.out.println("sb4 = " + sb4);//Niha  Hanım
        System.out.println("sb4.insert(6, \" \") = " + sb4.insert(5, " "));

        //istenen index karakter yerine birden çok katakter eklemek
        System.out.println("sb4.replace(8,10,\"hi\") = " + sb4.replace(8, 10, "hi"));

        //Sbuilder obj Stringe çevirme ->toString()
        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());

        //String ile StringBuilder karsilastirmasi
        /*
        Compare iki sb'i esit mi diye kontrol etmek icin
        ilk harften baslayarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey return etmezken
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
        oldugunu print eder
        Tamamen ayni ise bize 0 return eder

        bir sb ile bir String'i compare etmek istersek Java CTE verir
         */
        StringBuilder sb5=new StringBuilder("javaCAN");
        StringBuilder sb6=new StringBuilder("javaCAN");
        String  str1="javaCAN";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));//0
        System.out.println("sb6.compareTo(new StringBuilder(str1)) = " + sb6.compareTo(new StringBuilder(str1)));//0
        // sb6.compareTo((str1)//CTE-> elam armut kıyası olamazzz

        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb5));//false-> SB equals == gibi çalışır -> hem value hem de ref değere bakar
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));//true

        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));//True
    }
}
