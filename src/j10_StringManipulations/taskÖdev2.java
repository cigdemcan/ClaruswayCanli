package j10_StringManipulations;

import java.util.Scanner;

public class taskÖdev2 {
    public static void main(String[] args) {
/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */

        Scanner sc=new Scanner(System.in) ;
        System.out.println("bir kelime giriniz");
        String kelime= sc.nextLine();
        if(kelime.length()%2==0){
            System.out.println(kelime.substring(0,(kelime.length()/2)));

        }else System.out.println("girdiğiniz ifade tek sayılıdır yarısını bölemiyor");


        //task->
        //Girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz.
        //Ternary kullan

         Scanner scan=new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String a1=scan.nextLine();
        System.out.println("cümlede hangi kelimeyi arıyorsanız giriniz");
        String a2=scan.nextLine();
        System.out.println(a1.contains(a2));
    }
}
