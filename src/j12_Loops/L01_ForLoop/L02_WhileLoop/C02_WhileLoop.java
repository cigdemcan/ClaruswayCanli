package j12_Loops.L01_ForLoop.L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //girilen tam sayının rakamları toplamını print eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("agam bır tam sayı giriniz");
        int sayı = sc.nextInt();
        rakamTopla(sayı);//method call
    }

    private static int rakamTopla(int sayı) {
        int rakamTopla = 0;
        while (sayı > 0) {//sayı 1 olana dek bady action calış
            rakamTopla += sayı % 10;//sayının birler basamagi rakamtoplam eklendi
            sayı /= 10;//sayı bir basamak eksildi
        }
        return rakamTopla;
    }

}