package day07;

public class Q01_WhileDoWhile {
    //girilen sayının basamaklarındaki rakamların toplamını bulunuz
    public static void main(String[] args) {
        int sayı=2562;
        System.out.println(basamakToplamı(sayı));
    }

    private static int basamakToplamı(int sayı) {
        int toplam=0;
        while (sayı!=0){
            toplam +=sayı%10;
            sayı/=10;
        }
        return toplam;
    }
// do while
    //for

}
