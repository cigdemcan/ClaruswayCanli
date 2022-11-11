package j04_AritmeticOperators;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */

		Scanner scan=new Scanner(System.in);

		System.out.println("3 basamaklı sayı giriniz");
		int sayı= scan.nextInt();
		int basamak3=sayı/100;
		int basamak=sayı%10;
		System.out.println(basamak+basamak3);
		
	}

}
