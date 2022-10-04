package j03_ScannerClass_TypeCasting;

public class C02_TypeCasting {
    public static void main(String[] args) {

     int sayi1=33;
     int sayi2=7;
     System.out.println(sayi1/sayi2);//4
        /*
       java iki int sayıyı birbirine böldüğümüzde sonucuint verir
       eğer bölme işleminde ondalık sonuç çıkarsa ondalık kısmı siler
         */
        byte b=127;
        int i=b;
        System.out.println("i="+i);//127

        int num=1453;
        double d1=num;
        System.out.println( " d1="+d1);//1453
        //TRICK->iki farklı data type sayi işleme girerse java küçük olan data type türü için
        //aw yapar sonucu büyük olan data type olarak verir
    }
}