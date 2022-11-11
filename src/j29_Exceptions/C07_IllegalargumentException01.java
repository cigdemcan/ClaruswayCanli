package j29_Exceptions;

import java.util.Scanner;

public class C07_IllegalargumentException01 {/*
ahan da TRİCK kosesinde bugun :)

"throw" - throws" farkları
1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
   "throw" -> method body içinde tanımlanır.
2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
   "throw" -> keywordden sonra sadece bir tane exception tanımlanır
3- "throws" -> keywordden sonra sadece exception class name yazılır
    "throw" ->  keywordden sonra exception obj tanımlanır
4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
    "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
 */
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