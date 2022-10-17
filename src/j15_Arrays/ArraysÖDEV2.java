package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysÖDEV2 {
    public static void main(String[] args) {
     /*   Task 1->
                elemanları : Apple, Orange , Banana, Kiwi
        olan String Array (Dizi) crdeate edip print eden code create ediniz.
                */
   String str[]= {"Apple", "Orange", "Banana", "Kivi"};
        System.out.println(Arrays.toString(str));


           /* Task2  int Array oluşturun.
                elemanları : 13, 15,14,16,16
                Arrayin elemanlarını yazdırın.*/
       int arr[]= {13, 15, 14, 16, 16};
        System.out.println(Arrays.toString(arr));

  /*Task3  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.    */
        int arr1[] = {25, 30, 30, 35, 100};
        int toplam = 0;
        for (int i = 0; i < arr1.length; i++) {
            toplam += arr1[i];
            System.out.println(toplam);
        }

        /*Task4
        elemanları: "new jersey" , "new york", "boston","California" olan  String array  oluşturun ve
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.
         */
        String str1[] = {"new jersey", "new york", "boston", "California"};
        System.out.println(str1.length);


 /*Task05
        elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.*/
        int arr2[] = {5, 6, 8, 12, 14, 19};
        int sonuç = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                sonuç += arr2[i];
            } else
                sonuç -= arr2[i];
        }
        System.out.println(sonuç);


/*Task06
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */
        String str2[] = {"Apple", "Orange", "Banana", "Pineapple"};
        boolean flag = false;
        for (int i = 0; i < str2.length; i++) {
            if (str2[i] == "Apple") {
                flag = true;

                System.out.println(flag);
            }
        }

 /*Task07
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.*/

        int arr3[] = {12, 2, 5, 15, 8};
        int buyuk = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (buyuk < arr3[i]) {
                buyuk = arr3[i];
            }
        }
        System.out.println(buyuk);


 /* Task08 int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.*/
        int arr4[] = {14, 19, 5, 21};
        int kucuk = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] < kucuk) {
                kucuk = arr4[i];
            }
        }
        System.out.println(kucuk);

  /*Task09
       int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.*/
        int arr5[] = {15, 25, 22, 18, 30};
        Arrays.sort(arr5);
        System.out.println(arr5[arr5.length - 2]);

  /*Task10
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"*/
        String str3[] = {"Hello World"};
        String a = Arrays.toString(str3);
        for (int i = a.length() - 1; i > 0; i--) {
            System.out.print(a.charAt(i));
        }
        System.out.println();

  /*Task11
       int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.*/
        int arr6[] = {12, 14, 21, 23, 10, 4};
        int toplam1 = 0;
        int ortalama = 0;
        for (int i = 0; i < arr6.length; i++) {
            toplam1 += arr6[i];
            ortalama = toplam1 / arr.length;
        }
        System.out.println("ortalama:" + ortalama);

  /*Task12
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.
        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true
        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı*/
        int arr7[] = {1, 2, 3, 4};
        boolean result;
        if (Arrays.binarySearch(arr7, 1) >= 0 && Arrays.binarySearch(arr7, 4) >= 0) {
            result = false;
        } else result = true;
        System.out.println("result=" + result);

 /*Task13
  Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

  Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1 */
        int numara[] = {1, 0, 0, 1, 0};
        Arrays.sort(numara);
        System.out.println(Arrays.toString(numara));

    /*Task14
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld */
        String h = "Hello World";
        System.out.println(h.replace("o", "K"));

	/*Task15
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.*/
String j="Removes white space from both ends of a string";
String jArr[]=j.split(" ");

        System.out.print(jArr.length);
        System.out.println();

  /*Task16
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın. */
        String s = "$12 $23 $10 $2 $5 $2";
        int top = 0;        String sArr[] = s.split(" ");

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].contains("$")) {
                top += Integer.parseInt(sArr[i].replace("$", ""));
            }
        }
        System.out.println(top);

/*Task17
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız. */
        int arr8[][]={{2,3,2},{4,1,5},{7,2,5}};
        for (int i = 0; i <arr8.length ; i++) {
            System.out.println(Arrays.toString(arr8[i]).replaceAll("2","6"));

        }

  /*Task18
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır. */
       int arr9[][]={{5,2,1},{10,2,3,6},{1,2}};
       int topl=0;
        for (int i = 0; i < arr9.length; i++) {
            for (int k = 0; k < arr9[i].length; k++) {
                topl+=arr9[i][k];
            }}
        System.out.println(topl);

        /*Task19
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız. */
   String arr10[][] ={{"new jersey","atlanta","ohio"},{"Pittsburgh" ,"ohio","new york","ohio"}, {"ohio","new york"}};
        System.out.println(Arrays.deepToString(arr10).replaceAll("ohio","Florida"));


  /*Tas20
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.
    Oluşturacağınız int array'i =   ([1, 2, 3, 4])
    Sonuç bu şekilde olmalıdır. [1, 4] */
     int sayi[]={1,2,3,4};
     int yeniArr[]={sayi[0],sayi[3]};
        System.out.println(Arrays.toString(yeniArr));

  /*Task21
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı=sc.nextInt();
        String[]arrr=String.valueOf(sayı).split("");
        for (int i =arrr.length-1; i >=0 ; i--) {
            System.out.print(arrr[i]);
        }

}}




