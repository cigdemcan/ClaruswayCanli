package L01_ForLoop;

public class C01_Forloop {
    public static void main(String[] args) {
        //41 kere maasallah print ediniz
        System.out.println("maasallah");
        System.out.println("maasallah");
        System.out.println("maasallah");
        System.out.println("maasallah");
        System.out.println("maasallah");
        System.out.println("maasallah");

        /*loop->döngü tekrarlarına aksiyonlar için kullanılan code bloklarıdır*/
        //bas       bitiş  değişim
        for (int i = 1; i <= 41; i++) {
            System.out.println(i + ".maasallah");//1. maasallah ...41. maasallah

        }
        System.out.println("selam javacanlar bolcana offer");//döngü dişi 1 kez run eder
//task 2 basamklı tek sayıları yanyana print eden code create ediniz
        for (int i = 11; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
        for (int i = 0; i >10; i ++) {//sartı sağlamayan ->false olan for budy run olmaz
            //kod kırılarak sıradaki satırdan devam eder
            System.out.println("agam bu metnı okuduysan tukarıdaki for çalışmadı");
        }

    }
}