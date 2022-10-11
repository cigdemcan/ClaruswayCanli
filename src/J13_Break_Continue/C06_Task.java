package J13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {
        //task->girilen bir ifadedeki c karakterinden a karakter sayısını print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("agam bir ifade  giresen");
        String birşeyler=sc.nextLine();
        int aSayısı=0;
        for (int i=0;i<=birşeyler.length(); i++){
            if(birşeyler.charAt(i)=='a'){
                aSayısı++;
            } else if (birşeyler.charAt(i)=='c') {
                break;
            }
            System.out.println("dongüde işleme giren karakterler:"+birşeyler.charAt(i));

        }
        System.out.println("agam a sayısı:"+aSayısı);
}}
