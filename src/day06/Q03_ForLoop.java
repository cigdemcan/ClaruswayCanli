package day06;

public class Q03_ForLoop {
    public static void main(String[] args) {


        //Convert "Java" to "J*a*v*a*"

/* ForLoop
   print even numbers from 100 to 0 but do not use decrement(i--).

        INPUT      :
        OUTPUT  : 100 98 96 94 92 ....2 0
     */
        String str = "java";
        for (int i = 0; i < str.length() ; i++) {
            System.out.print(str.charAt(i) + "*");
        }
int num=100;
        for (int i=num; i>=0; i=i-2){//i-=2 aynıdır
            System.out.print(i+" ");

    }
}}