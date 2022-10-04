package j10_StringManipulations;

import java.util.Scanner;

public class Task08 {/*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String harfDepo="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char h=harfDepo.charAt(harfDepo.indexOf("H"));
        char a=harfDepo.charAt(harfDepo.indexOf("A"));
        char l=harfDepo.charAt(harfDepo.indexOf("L"));
        char u=harfDepo.charAt(harfDepo.indexOf("U"));
        char k=harfDepo.charAt(harfDepo.indexOf("K"));
        System.out.println(h+a+l+u+k);//aşçıı değerlerini toplar//373
        System.out.println(" "+h+a+l+u+k);//string birleştirir:haluk
    }
}
