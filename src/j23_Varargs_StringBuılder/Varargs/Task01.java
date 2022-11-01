package j23_Varargs_StringBuılder.Varargs;

public class Task01 {
    public static void main(String[] args) {


    /* task ->
    verilen Stringleri birleştiren concat isimli method creata ediniz
    input:"m","e","r","v","e";
    output:merve
     */
        String arr[]={"m","e","r","v","e"};
        strBirleştir(arr);


    }//main sonu
    public  static  void strBirleştir(String...str){
        String birlesenStr="";
        for (String w:str) {
          birlesenStr=  birlesenStr.concat(w);

        }
        System.out.println("birlesenStr = " + birlesenStr);
    }

}