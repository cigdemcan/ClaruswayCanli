package j23_Varargs_StringBuılder.Varargs;

public class Task02 {
    public static void main(String[] args) {
        /* girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan method creata ediniz*/
        System.out.println(toplaCarp(2, 24, 23, 38, 33, 21, 59, 26, 10));//468
        int arrTop[]={24, 23, 38, 33, 21, 59, 26, 10};
        System.out.println(toplaCarp(3,arrTop));

    }//main sonu

    public  static  int toplaCarp(int carpılacakSayi, int...toplanacakSayılar){
        int toplam=0;
        for (int a:toplanacakSayılar) {
            toplam+=a;


        }
     return carpılacakSayi*toplam;


    }
}
