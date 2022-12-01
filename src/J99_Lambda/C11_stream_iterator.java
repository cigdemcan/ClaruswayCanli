package J99_Lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C11_stream_iterator {
    //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endExclusive'e (exclusive) kadar sıralı bir IntStream return eder.
    public static void main(String[] args) {
        System.out.println("TASK01--> amele topla " + toplamAmele(10));//55
        System.out.println("    ****    ");
        System.out.println("TASK01--> cincix topla " + toplaCincix(10));//55
        System.out.println("    ****    ");
        System.out.println("TASK02--> cincix cift topla " + toplaCift(24));//156
        System.out.println("    ****    ");
        System.out.println("TASK03--> cincix ilk cift topla " + toplaİlkXCiftsayi(10));//156
        System.out.println("    ****    ");
        System.out.println("TASK04--> cincix ilk tek topla " + toplaİlkXTeksayi(10));//
        System.out.println("    ****    ");
        System.out.println("TASK05-->");
        ikininİlkXKuvvetiPrint(7);//2,4,8,16,32,64,128
        System.out.println("    ****    ");
        System.out.println("task08 -- > : "+istenenSayiXKuvvet(7, 5));
        System.out.println("task08 -- > : "+istenenSayiXKuvvet(3, 5));//243
        System.out.println("task08 -- > : "+istenenSayiXKuvvet(2, 3));//8
        System.out.println("task08 -- > : "+istenenSayiXKuvvet(10, 2));//100
        System.out.println("   ***   ");
        ıstenenSayıIlkXKuvvet(2,3);
        System.out.println("    ****    ");
        TASK07(3);

    }//main sonu
    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.

    // Structured Programming(amele coding)
    public static int toplamAmele(int x) {
        int toplam = 0;
        for (int i = 0; i <= x; i++) {
            toplam += i;

        }
        return toplam;

    }

    // Functional Programming(cıncıx code)
    public static int toplaCincix(int x) {
        return IntStream.range(1, x + 1).//manuel akıs tanımlandı
                sum();//akısa giren 1,2,3...x tam sayıları toplandı
    }

    //TASK 02 --> 1'de    x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int toplaCift(int x) {
        return IntStream.rangeClosed(1, x).filter(C01_LambdaExpression::ciftMi).sum();
//ranceClosed =1 de x de dahildir
    }

//TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static int toplaİlkXCiftsayi(int x){
       return IntStream.iterate( 2,t->t+2).//2`den baslayıp 2 arttırılan tekrar işlemi tanımlandı->2 ,4,6,8...
        limit(x).//akıstakı ilk x eleman toplandı
        sum();
        //iterate(seed, repeat action) --> seed'den başlayarak repeat action'a göre  sonsuza kadar elemanları akısa alır.
    }

//TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
public static int toplaİlkXTeksayi(int x){
    return IntStream.iterate( 1,t->t+2).//1`den baslayıp 2 arttırılan tekrar işlemi tanımlandı->1,3,5.....
            limit(x).//akıstakı ilk x eleman toplandı
            sum();

}

//TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
public static void ikininİlkXKuvvetiPrint(int x ){
     IntStream.iterate(2,t->t*2).//2 den baslayıp 2 ile carpılarak tekrar işlemi tanımlandı
             limit(x).forEach(C01_LambdaExpression::yazdır);


}
    public static void ıstenenSayıIlkXKuvvet(int a,int x){
        IntStream.iterate(a, t -> t*a).limit(x).forEach(C01_LambdaExpression::yazdır);
    }

    //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan code  create ediniz.
    public static void TASK07(int x){
        System.out.println(IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact));
    }




    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
    public static OptionalInt istenenSayiXKuvvet(int istenenSayi, int x){
        return  IntStream.
                iterate(istenenSayi,t->t*istenenSayi).//istenenSayi'den başlayıp istenenSayi ile çarpılarak tekrar işlemi tanımlandı
                        limit(x).//akısdaki ilk x eleman akısa alındı.
                        skip(x-1).//akısdaki x den önceki elelmanlar atlandı kalanlar akısa alındı
                        findFirst();//akısdaki ilk eleman :x. elelman alındı

    }
}