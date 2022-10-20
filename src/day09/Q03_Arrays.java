package day09;

import java.util.Scanner;

public class Q03_Arrays {
    public static void main(String[] args) {
        //kullanıcıdan bir cumle isteyın ve kelime sayısını yazdırın
        Scanner sc=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        System.out.println("kelime sayısı:"+ arr.length);
    }
}
