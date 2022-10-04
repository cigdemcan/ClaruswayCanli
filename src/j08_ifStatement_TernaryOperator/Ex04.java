package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /*task
        girilen bir karekterin  harf olup olmadığını kontrol eden code create ediniz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("bir karakter girin");
        char krktr=sc.nextLine().charAt(0);
        if((krktr>=  'A'&&krktr<='Z')||(krktr>='a'&&krktr<='z')){
            System.out.println("girdiğiniz karakter harftir");

        }else System.out.println("girdiğiniz karakter harf değildir");
    }
}
