package j09_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase_ATM_Project {
    public static void main(String[] args) {
        /* bakiye(başlangıç bakitesi 1000 tl)öğrenme,para yatırma ve çekme,çıkış işlemlerinin
        yapıldığı bir ATM yapıp code create ediniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("*** ATMye hoş geldiniz ***");
        System.out.println("Bakiye öğrenme ->1\n Para yatırma ->2\n Para çekme ->3\n Çıkış ->4\n Giriniz");
        int seçim=sc.nextInt();
        int bakiye =1000;

        switch (seçim){

            case 1:
                System.out.println("agam bakiyen:"+bakiye);
                break;
            case 2:
                System.out.println("agam ne kadar yatıracaksın");
                int yatırılanMiktar=sc.nextInt();
                bakiye+=yatırılanMiktar;
                System.out.println("agam bakiyenin güncel hali:"+bakiye);

                break;
            case 3:
                System.out.println("agam ne kadar çekecen:");
                int cekilenMiktar=sc.nextInt();
                if(cekilenMiktar> bakiye){
                    System.out.println("olmayan parayı mı çekecen:");
                    System.out.println("ahan da bakiyen"+bakiye);
                }else {
                    bakiye-=cekilenMiktar;
                    System.out.println("agam bakiyenin güncel hali:+bakiye");
                }
                break;

            case 4:
                System.out.println("agam çikişin yapıldı selametle");
                break;
            default:
                System.out.println("hatalı seçim");







        }





















    }
}
