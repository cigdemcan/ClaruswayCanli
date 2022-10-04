package j10_StringManipulations;

import java.util.Scanner;

public class task_Ödev {
    public static void main(String[] args) {



        //  Task->girilen e -mail hesabını @gmail.com içermiyorsa "lütfen gmail hesabi giriniz"
        //@gmail.com ile bitiyorsa "hesabınız onaylandı"aksi durumda geçerli hesap giriniz " print eden code create ediniz


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen e mail hesabı giriniz");

        String email = scan.nextLine();
        if (email.contains("@gmail.com")) {
            if (email.endsWith("@gmail.com")) {
                System.out.println("hesabınız onaylandı");
            } else System.out.println(" geçerli bir gmail hesap giriniz");
        } else System.out.println("yanlis giriş yaptınız");


        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.


        Scanner scn = new Scanner(System.in);
        System.out.println("javacanlar candır");
        String a1 = " ";
        System.out.println(a1.length());


        // TASK : Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
        //     kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
        //    Test data: ali eme all

        Scanner sc = new Scanner(System.in);
        System.out.println("üç harfli isim giriniz");
        String isim = sc.next();
        if (isim.length() == 3) {
            System.out.println(((isim.charAt(0) == isim.charAt(1)) && (isim.charAt(0) == isim.charAt(2)) && isim.charAt(1) == isim.charAt(2)) ? "Harflerin hepsi aynı" : "harfler aynı değil");
        } else {
            System.out.println("üç harfli isim girin");
        }

    }


}























