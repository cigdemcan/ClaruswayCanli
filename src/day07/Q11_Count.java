package day07;

import java.util.Scanner;

public class Q11_Count {   /*
 * Kullanicidan bir cumle ve bir harf alin,
 * Cumlede harfin kac kere
 * kullanildigini bulup, yazdirin
 *
 * ORNEK:
 *
 * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
 *
 * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle = sc.nextLine();
        System.out.println("bir harf giriniz");
      char harf=sc.next().charAt(0);
      int adet=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if(cumle.charAt(i)==harf){
                adet++;
            }
        }
        System.out.println("girilen cumlede "+harf+ "harf" +adet+ "tane var");
    }
}
