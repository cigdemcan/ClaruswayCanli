package day02;

public class Q06 {
    public static void main(String[] args) {

         /*
   not hesaplayici
              A => 90 ~100
              B => 80 ~ 89
              C => 70 ~ 79
              D => 60 ~ 69
              F =>  0 ~ 59
              sartlari aralik belirterek yaziniz
     write a program that:
        1. 0 ~12 ==> good morning
        2. 12 ~ 15 ==> good afternoon
        3. 15 ~ 23 ==> good night
        4. 12 ==> good noon
    */
        int grade = 85;
        if (grade >= 90 && grade <= 100) {

            System.out.println("A");
        } else if (grade < 90 && grade >= 80) {
            System.out.println("B");
        } else if (grade < 80 && grade >= 70) {
            System.out.println("C");
        } else if (grade < 70 && grade >= 60) {
            System.out.println("D");
        } else {
        }

    }
    }