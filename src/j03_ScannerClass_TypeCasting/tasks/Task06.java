package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */


        Scanner sc=new Scanner(System.in);
        System.out.println("ucgenın bir acısını giriniz");
        int kenar1=sc.nextInt();
        System.out.println("ucgenın diğer acısını giriniz");
        int kenar2=sc.nextInt();
        int hipotenus=((kenar1*kenar1)*(kenar2*kenar2));
        System.out.println("hipotenus = " + hipotenus);

    }
}
