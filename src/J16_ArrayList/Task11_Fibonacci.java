package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */
     public static void main(String[] args) {

   Scanner sc=new Scanner(System.in)  ;
List<Integer>fibonacci=new ArrayList<>();
          System.out.println("sayı giriniz");
          int sayı=sc.nextInt();
          int a=1;
          int b=1;
          int temp;


          fibonacci.add(a);
          while (b<=sayı){
               fibonacci.add(b);
          temp = b;
          b=a+b;
          a=temp;
     }
        System.out.println(fibonacci);



}}