package j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
    //task->girilen haftanın hafta içi veye hafta sonu olduğunu belirten code create  ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("gun giriniz");
String gun=sc.next();
        switch (gun){
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("girilen gün haftaiçi");
                break;
            case"cumartesi":
            case"pazar":
                System.out.println("girilen gün hafta sonu");
                break;
            default:
                System.out.println("lütfen doğru giriş yapınız");

        }







    }
}
