package L01_ForLoop.Task;

import java.util.Scanner;

public class Task08_Nested {
    public static void main(String[] args) {
        /*task->girilen boyutta kare çarpım tablosu print eden code create ediniz
        1 2 3 4 5
        2 4 6 8 10
        3 6 9 12 15
        4 8 12 16 20
        5 10 15 20 25
        5*5
         */
        Scanner sc=new Scanner(System.in);
        int boyut=sc.nextInt();
        for (int i=1; i<=boyut;i++){
            for (int j=1;j<=boyut; j++ ){
                System.out.print(" "+(i*j));
            }
            System.out.println();
        }

    }
}
