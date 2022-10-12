package day07;

import java.util.Scanner;

public class Q10_Break {
  /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("pozitif bir tam sayı giriniz");
      int sayı=sc.nextInt();
      boolean asalMI=true;
      for (int i = 2; i <sayı ; i++) {
          if(sayı%i==0){
              asalMI=false;
              System.out.println("sayı asal degildir");
              break;
          }else{
              System.out.println("sayı asaldir");
          break;
      }
  }
}}
