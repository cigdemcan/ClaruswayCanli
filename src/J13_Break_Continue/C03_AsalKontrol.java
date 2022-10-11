package J13_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
//task->girilen tamsayının asal olmasını kontrol eden code create ediniz
//asal tamsayı:1 ve kendisinden baska tam boleni olmayan sayılar
        Scanner sc=new Scanner(System.in);
        System.out.println("agam bir tam sayı giresen");
int sayı=sc.nextInt();//23->2,3,4,5,6,7..23 24
                      //    v * *        *->false
boolean aslMı=true;
        for(int i=2; i<sayı; i++){
            if(sayı%i==0){//eger sayı kendisine kadar olan sayılara tam bolunuyor
                aslMı=false;
                break;
        }
    }
        if (aslMı){
            System.out.println("girilen sayı asal");
        }else System.out.println("girilen sayı asal degil");
}}
