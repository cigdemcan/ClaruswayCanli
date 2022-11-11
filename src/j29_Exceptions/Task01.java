package j29_Exceptions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        task ->girilen pasword un 6 karakterden az 10 karakterden fazla olmamasını kontrol eden code creata ediniz
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("agam pasword giresen");
        String pasword = sc.next();
        try {
            if (pasword.length() < 6){
                throw new IllegalArgumentException("agam 6 karakterden az girdin");
        }else if (pasword.length()>10){
            throw new IllegalArgumentException("agam 10 karaakterden fazla girdin ");
        } else System.out.println("agam pasaword geçerli");
        }catch (IllegalArgumentException e){
           // System.out.println(e);
        System.out.println("agam Allah bildiği gibi yapsın");
        }
        System.out.println("agam sorun handle edildi ");
    }

}