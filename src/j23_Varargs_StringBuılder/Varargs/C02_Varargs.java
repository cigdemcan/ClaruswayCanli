package j23_Varargs_StringBuılder.Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        /*arr ve varargs method*/
        int arr[]={24,42,33,19,34,45,58,38};
        System.out.println("arrTopla(arr) = " + arrTopla(arr));

        System.out.println("varargs int değer toplam " + varargsTopla(24, 42, 33, 19, 34, 45, 58, 38));
        System.out.println("varargs  array değer toplam " + varargsTopla(arr));

        //Trick:varargs method parametreleri array gibi tanımladığı için
        //varargs methoda parametre olarak array de verilebilir


        //Task1-> verilen array elemanları toplamı print eden method creata ediniz
       //Task2->task1 varargs ile calışınız

    }//main sonu
     public static int arrTopla(int[] a){//task1
        int toplam=0;
        for (int w:a){
            toplam +=w;
        }
        return toplam;
    }
    public static int varargsTopla(int...b){//task2
        int toplam=0;
        for (int s:b) {
            toplam +=s;

        }
        return toplam;
    }

}
