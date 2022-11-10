package j29_Exceptions;

import java.util.Scanner;

public class C07_IllegalargumentException {
    public static void main(String[] args) {
        //IllegalargumentException-: kullanılmasını istemediğimiz değerlerde pr hata vermesi isteniyorsa bu exce.
        // fırlatılır örnek: tas datası için negatif değerler girildiğinde pr. kırılmadan run olması ama girilen değer için excep.
        //fırlatılması için kullanılır
        Scanner sc = new Scanner(System.in);
        System.out.println("agam yasını giresen: ");
        int age = sc.nextInt();
        try {if(age<0){
            throw  new IllegalArgumentException();//throw keyword excep.obj oluşturularak hata tanımlanır ve fırlatılır
            //böylece şartımıza uymayan değer için de catch block a düşürerek daha pratik code yazıldı
        }else System.out.println("agam yasın hayırlı olsun"+age);
            System.out.println("agam try block da bu yazıyı okuduysan  exce. fırlatmadı komut sorunsuz");

        } catch (IllegalArgumentException e) {
            System.out.println("agam adam gibi yas gir");
            System.out.println("agam catch block da bu yazıyı okuduysan  exce. fırlatmadı komut sorunsuz");


        }
        System.out.println("agam sorun handle eildi devamkee");//bu kod calışmışsa pr sorunsuz kırılmadan run olmuştur
    }
}