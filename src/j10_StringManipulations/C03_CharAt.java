package j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        /*charAt() methodu paremetre int olarak girilen index deki char değerini return eder.
        index değeri 0`dan başlar
         */
        String şehir="Istanbul";
        System.out.println("şehir.charAt(5)="+şehir.charAt(5));
        char beşinciİndexKrktr=şehir.charAt(5);
        System.out.println(beşinciİndexKrktr);//b
        //son index karekteri -->lenght()-1
        System.out.println(şehir.charAt(şehir.length()-1));
          //ilk index karakter-->charAt(0)
        System.out.println(şehir.charAt(0));//I

      //  System.out.println();şehir.charAt(18);//rte

        //TRİCK->charAt(index boyutunu geçerse rte verir
        //Task-:istanbul izmir girilen kelimenin ortasındaki karakteri print eden code creata ediniz

        Scanner sc =new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime =sc.nextLine();
        if(kelime.length()%2!=0) {
            System.out.println();
            kelime.charAt((kelime.length() - 1) / 2);
        }else System.out.println("girilen kelimenin orta karakteri yoktur");

        }



    }

