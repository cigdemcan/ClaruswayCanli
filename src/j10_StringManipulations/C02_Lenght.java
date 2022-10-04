package j10_StringManipulations;

public class C02_Lenght {
    public static void main(String[] args) {
    /*length methodu girilen stringin uzunluğunu içinde bulunan karekter sayısını return eder.
    butun karekterleri (boşluk vs) sayıp adedini verir
     */

       String str="madem geldin dünyaya oyur çaliş javaya" ;
       int strKrktrSayısı =str.length() ;//int type bir data verir
        System.out.println(str);//madem geldin dünyaya otur çalış javaya
        System.out.println(strKrktrSayısı);//38
        System.out.println(str.length());//38

        String str1="";
        System.out.println(str1.length());//0

        String str2=" ";
        System.out.println(str2.length());//1

        String str3=null;//null bir değer değildir hiçliktir run bunu tanımlıyamaz
        System.out.println(str3.length());//Run time error

        /*null case sensitivedir yani null veya NULL yazılamaz null bir değer değildir sadece hiçliği gösteren bir pointer*/









    }
}
