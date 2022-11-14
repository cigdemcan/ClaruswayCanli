package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {
        //TASK->girilen bir tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.
       Scanner sc=new Scanner(System.in);
        System.out.println("agam bir sayı gir bakalım");
        int agaSayisi= sc.nextInt();
        System.out.println(agaSayisi > 9 ? "sayı iki veya daha fazla basamaklı" : "sayı tek basamaklı");



    }
}