package J11_MethodCreation;

import java.util.Scanner;

public class Task04Atm {

  /* bakiye(başlangıç bakitesi 1000 tl)öğrenme,para yatırma ve çekme,çıkış işlemlerinin
        yapıldığı bir ATM yapıp code create ediniz
         */
       static Scanner sc=new Scanner(System.in);
        static int bakiye =1000;

    public static void main(String[] args) {
        System.out.println("agam ne yapacaksan seç");
        int seçim= sc.nextInt();
        switch (seçim){
            case 1:
                bakiyeVer();
                break;
            case 2:
                paraYatır();
                break;
            case 3:
                paraÇek();
                break;
            case 4:
                çıkışYap();
                break;
            default:
                System.out.println("agam daha seçim yapamirsen bir de para istirsen");
       }



    }

    private static void çıkışYap() {
        System.out.println("çıkışınız yapıldı");
    }

    private static void paraÇek() {
        System.out.println("ne kadar çekecen:");
        int çekilecekMiktar=sc.nextInt();
        if (çekilecekMiktar<=bakiye){
            bakiye-=çekilecekMiktar;
            System.out.println("agam para cebinde");
            System.out.println("agam bakiye:"+bakiye);
        }else System.out.println("agam olmayan parayı mı çekecen");
        karar();

    }

    private static void karar() {
        System.out.println("agam işleme \n devam->1\n yeter->0");
        int karar=sc.nextInt();
        if (karar==1){
            seçim();

        } else if (karar==0)çıkışYap();
        else System.out.println("agam adam gibi karar gir");

        }

    private static void seçim() {
    }


    private static void paraYatır() {
        System.out.println("ne kadar yatıracaksın");
        int yatırılacakMiktar;
        System.out.println("agam para hesabında");
        karar();
    }

    private static void bakiyeVer() {
        System.out.println("agam bakiye:"+bakiye);
        karar();
    }
}
