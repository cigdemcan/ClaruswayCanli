package j10_StringManipulations;

import java.util.Scanner;

public class C05_Start_EndWith {
    public static void main(String[] args) {
        /*sartsWith()
        metnin baş kısmının istenilen dizi ile eslesip eşleşmediğini kontrol eder.Sonucu boolean dır
        Stringin başladığı characteri doğrular
        endWith()
        metnin son kısmının istenilen dizi ile eşleşip eşleşmediğini kontrol eder
         */
        String şehir= "istanbul";
        System.out.println( şehir.startsWith("i"));
        System.out.println(şehir.startsWith("is"));
        System.out.println(şehir.startsWith("s"));
        System.out.println(şehir.startsWith("a",3));//true 3. indexden itibaren string a ile mi başlar

        System.out.println(şehir.endsWith("l"));
        System.out.println(şehir.endsWith("bul"));
        System.out.println(şehir.endsWith("bu"));

          String str="bul";
        System.out.println (şehir.endsWith(str));
        //Task->girilen e -mail hesabını @gmail.com içermiyorsa "lütfen gmail hesabi giriniz"
        //@gmail.com ile bitiyorsa "hesabınız onaylandı"aksi durumda geçerli hesap giriniz " print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("e mail giriniz");
        String eMail=sc.nextLine();
        if (false){
            System.out.println(eMail.endsWith("@mail"));
            System.out.println("gecerli email giriniz");
        }else {
            System.out.println("hesabınız onaylandı");
        }



    }
}
