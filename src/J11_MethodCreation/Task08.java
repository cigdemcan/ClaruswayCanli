package J11_MethodCreation;

import java.util.Scanner;

public class Task08 {
    // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
// ceviren bir method yaziniz.
    public static void main(String[] args) {
        cevırDeger();

    }

public static void cevırDeger(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Seçim yapınız : \n -> st \n -> mil \n -> kg  ");
    String secım = sc.next().toLowerCase();
    switch (secım){
        case "st":
            System.out.println("bır saat giriniz" );
            double saat=sc.nextInt();
            System.out.println("sonuc saat :" +saat*60*60);
            break;

        case "ml" :
            System.out.println("bır ml giriniz");
            double mil=sc.nextDouble();
            System.out.println("sonu km :" + mil*1.6);
            break;
        case "kg":
            System.out.println("bır kg gırınız");
            double kg=sc.nextDouble();


            System.out.println("sonuc kg" + kg*1000);
            break;
        default:
            System.out.println("gecersiz deger girdiniz");
            break;
    }

}

}