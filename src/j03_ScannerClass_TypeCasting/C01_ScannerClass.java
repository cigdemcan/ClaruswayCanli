package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
        // kullanıcıdan veri almak için çu 3 adım takip edilir
        //1.adım->Scanner classdan obj creata edilir

        Scanner  scan= new Scanner(System.in);//Scanner classından scan isminde değerini System içinden alan bir obj

        //2adım->Kullanıcıda istenen veri için bildirimde bulunur->sout("...")

        System.out.println("adınızı giriniz:");
        //3.adım-> kullanıcının girdiği data type ne göre bir variable atanır.
         String isim= scan.nextLine();//kullanıcıdan gelen String tipinde isim verisi scan obj ni nextLine methodu ile atandı
        System.out.println("isim="+isim);

        //Task->Kullanıcının girdiği değere göre kare alanı ve çevresini hesaplayan bir code creata ediniz..

      //  Scanner sc =new Scanner(System.in);//1.adım
     //   System.out.print("karenin kenarını giriniz");//2.adım
      //  int kenar= sc.nextInt();//3.adım
       // System.out.println("alan:"+(kenar*kenar+"çevre:"+(kenar*4)));

        Scanner sc = new Scanner(System.in);//1. adım
        System.out.println("isminizi giriniz");//2.adım
        char ch= sc.nextLine().charAt(1) ;//kullanıcıdan gelen string ifadenın ilk karekterini alır
        System.out.println("isminizin ilk karakteri:"+ch);







         }

}