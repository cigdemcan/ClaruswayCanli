package day11;

public class Q06_Varargs02 {

    // Create a multiply method with double varargs (return double)

    public static void main(String[] args) {
        System.out.println(carpım(1,2,3,2.3));
    }
    public static double carpım(double... a) {

        int carpım = 1;
        for (double each : a) {
            carpım *= each;


        }
            return carpım;
        }}



