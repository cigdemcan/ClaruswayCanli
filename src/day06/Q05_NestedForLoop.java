package day06;

import java.util.Scanner;

public class Q05_NestedForLoop {
    public static void main(String[] args) {
        /*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("satır sayısı:");
        int satır=sc.nextInt();
        System.out.println("sutun sayısı:");
        int sutun=sc.nextInt();
        for (int i = 1; i <=satır ; i++) {
            for (int j = 1; j<=sutun ; j++) {
                System.out.print("* ");

            }
            System.out.println();//dumy, bu bosluk olmazsa hepsini yan yana yazdırır
        }
    }
}
