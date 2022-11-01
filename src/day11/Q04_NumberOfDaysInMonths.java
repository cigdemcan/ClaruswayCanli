package day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Q04_NumberOfDaysInMonths {

    /*
    Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

    INPUT:
    Ay Numarasi:
    2
    Yil :
    2016
    OUTPUT :
    Subat 2016 29 Gundur.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ay no :");
        int month=sc.nextInt();
        System.out.println(" yil no :");
        int year= sc.nextInt();
        LocalDate ayGun = LocalDate.of(year,month,1);
        System.out.println(ayGun.getMonth() +" " +ayGun.getYear() +" " +ayGun.lengthOfMonth() + "days");


    }
}