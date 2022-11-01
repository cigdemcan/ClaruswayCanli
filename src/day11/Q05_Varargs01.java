package day11;

public class Q05_Varargs01 {

        //istediğimiz kadar sayi girdiğimizde
        //toplamları bize veren bir method create ediniz
        public static void main(String[] args) {
       sumAll(5,9,-12,0,100,8)  ;   
        }
   private static void sumAll(int...sayi) {
            int toplam=0;
        for (int each:sayi) {
            toplam +=each;
        }
        System.out.println("toplam = " + toplam);
    }
}
