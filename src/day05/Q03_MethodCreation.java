package day05;

import java.util.Scanner;

public class Q03_MethodCreation {
/*cm olarak verilen bir sayıyı ,metre ve km donusturen bir method yazınız*/

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı girirniz");
        double sentiMetre=scan.nextDouble();
        System.out.println(meter(sentiMetre));
        System.out.println(kılometre(sentiMetre));
        converFromSM(sentiMetre);
    }
public static double meter(double x){
        return x/100;
}
public static double kılometre(double y){
        return y/100000;
}

public static void converFromSM(double sayi){
    System.out.println("girilen cm değeri :"+sayi/100+"metre\n"+sayi/100000+"km");
}





}
