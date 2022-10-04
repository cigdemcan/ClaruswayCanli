package j09_SwitchStatement;


import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        /*Switch case deyimi işlev bakımından if deyimine çok benzer.Çok sayıda if işlem blokları kullandığımızda
        programın okunurluğu
         */

        //TASK->kullanıcının girdiği rakamı yazı ile print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("agam bir sayı gir bakam");
        int rakam=sc.nextInt();

      switch(rakam){
          case 0:
              System.out.println("girilen rakam SIFIR");
              break;
          case 1 :
          System.out.println("girilen rakam BİR");
              break;
          case 2 :
              System.out.println("girilen rakam İKİ");
              break;
          case 3 :
              System.out.println("girilen rakam üç");
              break;
          case 4 :
              System.out.println("girilen rakam DÖRT");
              break;
          case 5 :
              System.out.println("girilen rakam BEŞ");
              break;
          case 6 :
              System.out.println("girilen rakam ALTI");
              break;
          case 7 :
              System.out.println("girilen rakam YEDİ");
              break;
          case 8 :
              System.out.println("girilen rakam sekiz");
              break;
          case 9 :
              System.out.println("girilen rakam dokuz");
              break;

      }


    }
}
