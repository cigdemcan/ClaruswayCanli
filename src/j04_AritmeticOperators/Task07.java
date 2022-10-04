package j04_AritmeticOperators;

public class Task07 {

	public static void main(String[] args) {
		
		/* Soru 5:
		 * 120 yi 60 a bolunuz, sonucu 10 ile carpip 20 ile toplayiniz, cikan sonuctan 40 cikariniz.
		 */

		int first=120, second=60,third=10,fourth=20,fifth=40;
		//(((120/60)*10)+20)-40
		int sonuç=((((first/second)*third)+fourth)-fifth);
		System.out.println(sonuç);


	}

}
