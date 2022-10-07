package L01_ForLoop.Task;

import java.util.Scanner;

public class TASK10_Nested {
    public static void main(String[] args) {
        /* girilen bir ifadenin istenen harf sayısını print eden code create ediniz
        input:selam javaCAN`lar
        autput: a sayısı :3
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("bir cumle giriniz : ");
        String cümle = sc.nextLine();

        System.out.println("bir harf giriniz");
        char harf = sc.nextLine().charAt(0);
        int harfSayısı=0;
        for (int i = 0; i <cümle.length(); i++) {
           if(cümle.charAt(i)==harf){
               harfSayısı++;


            }

        }
        System.out.println("girdiğiniz cumle:"+cümle+"de istediğiniz harf:"+harf+harfSayısı+"kadar var");
    }
}

