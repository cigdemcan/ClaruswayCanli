package j23_Varargs_StringBuılder.StringBuilder;

public class Task01 {
    public static void main(String[] args) {
        /*
Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
       olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
    (without case sensitivity)
    Eg : input : I love Java
    Output: "Reversed sentence : avaJ evol I
       It is not a palindrome"

 */
        System.out.println("tersString(\"ece\") = " + tersString("ece"));
        System.out.println("tersString(\"serhat\") = " + tersString("serhat"));

        StringBuilder sb1=new StringBuilder("ali");
        tersSB(sb1);

        tersSB(new StringBuilder("serhat"));
        System.out.println("isPolindrom(\"nazım\") = " + isPolindrom("nazım"));//false
        System.out.println("isPolindrom(\"aga\") = " + isPolindrom("aga"));//true
    }//main sonu

    public static String tersString(String str){
        String stringTersi="" ;
        for (int i = str.length()-1; i >=0 ; i--) {
            stringTersi+=str.charAt(i);

        }
        return  stringTersi;
    }

public  static  void tersSB(StringBuilder sb){

        System.out.println("sb.reverse() = " + sb.reverse());//sb ters çeviri
}
public static  boolean isPolindrom(String str){
        if (str==null){
            return false;
        }
        return new StringBuilder(str).reverse().toString().equals(str);

        //String ile StringBuilder karsılastırması/*
    //Compare iki sb'i esit mi diye kontrol etmek icin
    //ilk harften baslayarak tum karakterleri karsilastirir
    //Ayni olan karakterler icin bir sey return etmezken
    //farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
    //oldugunu print eder
    //Tamamen ayni ise bize 0 return eder
    //
    //bir sb ile bir String'i compare etmek istersek Java CTE verir
    // */
   /* StringBuilder sb6=new StringBuilder("javaCan");
    StringBuilder sb5=new StringBuilder("javaCan");
    String str1="javaCan";
    System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));
    System.out.println("sb6.compareTo(new StringBuilder(str1)) = " + sb6.compareTo(new StringBuilder(str1)));
    //sb6.compareTo((str1)//CTE->elma armut kıyası olmaz
    System.out.println("sb6.equals(sb5) = " + sb6.equals(sb5));//false
    System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));//true

    System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));//true
*/

}}

