package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {


        /*TASK->kullanıcını cinsiyeti kadın ise 60 yaşından büyük ve prim günü 6000 den fazla ise emekliliğini
        kullanıcını cinsiyeti erkek ise 65 yasından büyük ve prim günü 7000 denfazla ise emekliliğini kontrol edip kalan yıl ve prim gününü
        prin eden code create ediniz
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("cinsiyetiniz \n kadın için ->K \n erkek için ->E\n giriniz:");
        char cnsyt = sc.next().charAt(0);
        int yas = sc.nextInt();
        if (cnsyt == 'K') {
            if (yas > 60) {
                System.out.println("prim gününü giriniz");
                int primGünü = sc.nextInt();
                if (primGünü > 6000) {
                    System.out.println("tebrikler emekli oldunuz");

                } else System.out.println("emekliliğiniz için:" + (6000 - primGünü) + "yatırmanız lazım");

            } else System.out.println("emekliliğinize daha:" + (60 - yas) + "yıl daha var");


        } else if (cnsyt == 'E') {

            if (yas > 65) {
                System.out.println("prim gününü giriniz");
                int primGünü = sc.nextInt();
                if (primGünü > 7000) {
                    System.out.println("tebrikler emekli oldunuz");

                } else System.out.println("emekliliğiniz için:" + (7000 - primGünü) + "yatırmanız lazım");

            } else System.out.println("emekliliğinize daha:" + (65 - yas) + "yıl daha var");
        } else System.out.println("agam ne olduğunu gir ona göre emekli edeyim seni");
    }
}
