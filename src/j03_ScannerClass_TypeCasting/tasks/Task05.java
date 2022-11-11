package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		Scanner sc=new Scanner(System.in);
		System.out.println("iki tam sayı giriniz");
		int sayı1=sc.nextInt();
		int sayı2=sc.nextInt();
		int topla=sayı1+sayı2;
		int cıkar=sayı1-sayı2;
		int carp=sayı1*sayı2;
		int bol=sayı1/sayı2;
		System.out.println(topla);
		System.out.println(cıkar);
		System.out.println(carp);
		System.out.println(bol);


	}

}
