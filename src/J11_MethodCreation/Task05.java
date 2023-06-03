package J11_MethodCreation;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /*
Ismi randomNum olan bir method oluşturun.
Parametre olarak int max almalı.
Bu method, 0 ile max arasında.random bir değer döndürmelidir.
Random numarayı döndürünüz.
Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("bır sayı gırınız");
        int maxSayi= scanner.nextInt();
        System.out.println("randomNum(maxSayi) = " + randomNum(maxSayi));


    }
    public static int randomNum(int maxSayı){
        int randomNum= (int) (Math.random()*maxSayı);
        return randomNum;
    }
}
