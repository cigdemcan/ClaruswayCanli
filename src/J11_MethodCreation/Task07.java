package J11_MethodCreation;

import java.util.Scanner;

public class Task07 {
    /*
  powerOfThree isminde bir method oluşturun.
      Parametre olarak int
      Return tipi boolean
      Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
      Örnek 1:
      Girdi: 27
      Çıktı: true
      Açıklama: 3*3*3 =27
      Sonuç= true

      Örnek 2:
      Girdi: 0
      Çıktı: false
      Örnek 3:
      Girdi: 9
      Çıktı: true
      Açıklama: 3*3 = 9
      Sonuç= true

      Örnek 4:
      Girdi: 45
      Çıktı:: false
      Açıklama: 3*3*3*3 =81
      Sonuç= false
      45, 3ün üssü (kuvveti) değildir.
   */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bır sayı gırınız");
        int number= scanner.nextInt();
        System.out.println("powerOfThree(number) = " + powerOfThree(number));


    }


    public  static boolean powerOfThree(int number){
        int carpım=1;
        boolean a=false;
        for (int i = 1; i <number/3 ; i++) {
            carpım*=3;
            if (number==carpım){
                a=true;

            }

        }return a;

    }
}
