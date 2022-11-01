package j23_Varargs_StringBuılder.Varargs;

public class Task03 {
    public static void main(String[] args) {
        /*Task->girilen bir sayı ile Stringlerin en uzun harf sayısını çarpıp print eden code create ediniz
        */

        int sayi=5;
        String str1="muharrem";
        String str2="ugur";
        String str3="ebikgabık";
        carpStringEnUzun(sayi,str1,"JavaCan",str2,str3);//45
    }//main sonu
    public  static void carpStringEnUzun(int carpılacakSayı,String...str){
        String enUzun="" ;
        for (String a:str) {
            if (a.length()>enUzun.length()){
                enUzun=a;

            }

        }
        System.out.println("agam istediğin değer :" +(carpılacakSayı*enUzun.length()));
    }
}
