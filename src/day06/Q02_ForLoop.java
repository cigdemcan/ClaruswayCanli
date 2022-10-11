package day06;

public class Q02_ForLoop {
    //Interview Question
// 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
    public static void main(String[] args) {

        for (int i = 0; i <= 255; i++) {
            char karakter = (char) i;
            System.out.println(i + "=" + karakter);
        }
        int a = 0;
        while (a <= 255) {
            char c = (char) a;
            System.out.println(a + "=" + c);
            a++;
        }
        int x = 0;
        do {
            char k = (char) x;
            System.out.println(x + "=" + k);
            a++;
        } while (x <= 255);
    }
}








