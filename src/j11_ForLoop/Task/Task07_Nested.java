package j11_ForLoop.Task;

import java.util.Scanner;

public class Task07_Nested {
    public static void main(String[] args) {
        /*task->girilen boyutta bir kare için
bir sayı giriniz:7
1 0 0 0 0 0 0
0 1 0 0 0 0 0
0 0 1 0 0 0 0
0 0 0 1 0 0 0
0 0 0 0 1 0 0
0 0 0 0 0 1 0
0 0 0 0 0 0 1

 bir sayı giriniz:5
 1 0 0 0 0
 0 1 0 0 0
 0 0 1 0 0
 0 0 0 1 0
 0 0 0 0 1

 */
        Scanner sc=new Scanner(System.in);
        System.out.print("kare için boyut giriniz");
        int boyut= sc.nextInt();

        for(int i = 1; i<=boyut; i++) {//apt döngü
            for (int j = 1; j <= boyut; j++) {//daire döngü
                if (i == j) {
                    System.out.print("1 ");
                } else System.out.print("0 ");
            }
            System.out.println();


        }







    }
}
