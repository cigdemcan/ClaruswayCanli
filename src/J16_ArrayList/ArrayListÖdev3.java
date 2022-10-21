package J16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class ArrayListÖdev3 {


      

   /* //TASK07->
    //    common_values() isminde bir method oluşturun.   Parametre olarak 2 tane Integer ArrayList
    //    Return tipi integer ArrayList olmalı   İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
    //    Örneğin;       ArrayList 1:    3 , 2 , 5 , 6        ArrayList 2:     5 , 8 , 9 Retun 5 olmalıdır*/

     /*   ArrayList<Integer> sayı1 = new ArrayList<>(List.of(3, 2, 5, 6));
        ArrayList<Integer> sayı2 = new ArrayList<>(List.of(5, 8, 9));


        System.out.println(common_values(sayı1, sayı2));
    }

    public static List<Integer> common_values(List<Integer> sayı1, ArrayList<Integer> sayı2) {
        ArrayList<Integer> ortakSayı = new ArrayList<>();
        for (int i : sayı1) {
            for (int j : sayı2) {
                if (i == j && !ortakSayı.contains(i)) {
                    ortakSayı.add(j);
                }
            }
        }
        return ortakSayı;


    }*/
    //TASK08->ArrayList`teki en buyuk 2. sayıyı bulun ve yazdırın*/

    /*    ArrayList<Integer> list2 = new ArrayList<>(List.of(2, 5, 8, 0, 6));
        System.out.println(maxSayı(list2));

    }

    private static int maxSayı(ArrayList<Integer> list2) {
        int maxSayı = 0;
        Collections.sort(list2);
        maxSayı = list2.get(list2.size() - 2);

        return maxSayı;

    }*/
//TASK09->2D`li Arrayìn tum elemanlarını bir ArrayList`te yukleyın ve yazdırın

  /*  public static void main(String[] args) {
        Integer[][] arr = {{2, 3, 4}, {2, 4, 6}, {1, 3, 5}};
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list3.addAll(Arrays.asList(arr[i]));

        }
        System.out.println("list3 = " + list3);


        //TASK10->Arraylistìn iki int arasında kac değer old yazdırınız
        ArrayList<Integer> list4 = new ArrayList<>(List.of(1, 5, 22, 10, 20, 14, 8, 25, 30, 28));
        int a = 10;
        int b = 30;
        System.out.println("rangeBtw(list4,10,30 ) = " + rangeBtw(list4, 10, 30));

    }

    private static int rangeBtw(ArrayList<Integer> list4, int i, int i1) {
        int count = 0;
        for (int a : list4) {
            if (a >= 10 && a <= 30) {
                count++;

            }
        }
        return count;

    }}
*/
    //task->11 negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kac asal sayı var ise yazdırınız


 /*   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> asalSayı = new ArrayList<Integer>();
        System.out.println("pozitif bir sayı giriniz");
        int sayı = sc.nextInt();
        for (int i = 2; i <= sayı; i++) {
            int flag = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    flag++;
                }
            }
            if (flag == 1) {
                asalSayı.add(i);
            }

        }
        System.out.println(asalSayı.size());


//TASK12->
//    dupicate() isminde bir method oluşturun.
//    Parametresi int Array olmalı
//    Return tipi boolean
//    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
//    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
//
//    Örnek1:
//    Input: [1,2,3,1]
//    Output: true

     /*   int[] arr = {12, 34, 23, 11};
        System.out.println(dupicate(arr));
    }
    private static boolean dupicate(int[] arr) {
      boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    flag=true;
                break;

            }
        }
return flag;
 public static void main(String[] args) {
     ArrayList<Integer> list2 = new ArrayList<>(List.of(2, 5, 8, 0, 6));
     System.out.println(maxSayı(list2));

 }

    private static int maxSayı(ArrayList<Integer> list2) {
        int maxSayı = 0;
        Collections.sort(list2);
        maxSayı = list2.get(list2.size() - 2);

        return maxSayı;
*/
     /* //TASK07->
    //    common_values() isminde bir method oluşturun.   Parametre olarak 2 tane Integer ArrayList
    //    Return tipi integer ArrayList olmalı   İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
    //    Örneğin;       ArrayList 1:    3 , 2 , 5 , 6        ArrayList 2:     5 , 8 , 9 Retun 5 olmalıdır*/
 public static void main(String[] args) {

     ArrayList<Integer> sayı1 = new ArrayList<>(List.of(3, 2, 5, 6));
     ArrayList<Integer> sayı2 = new ArrayList<>(List.of(5, 8, 9));


     System.out.println(common_values(sayı1, sayı2));
 }

    public static List<Integer> common_values(List<Integer> sayı1, ArrayList<Integer> sayı2) {
        ArrayList<Integer> ortakSayı = new ArrayList<>();
        for (int i : sayı1) {
            for (int j : sayı2) {
                if (i == j && !ortakSayı.contains(i)) {
                    ortakSayı.add(j);
                }
            }
        }
        return ortakSayı;

 }}