package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */

        Scanner sc=new Scanner(System.in);
        System.out.println("sınav notunu giriniz");
        int sınavN=sc.nextInt();

        System.out.println("final notunu giriniz");
        int finalN=sc.nextInt();

        System.out.println("proje notunu giriniz");
        int projeN=sc.nextInt();

        double ortalama=sınavN*0.30+projeN*0.20+finalN*0.50;
        System.out.println(ortalama);
    }
}
