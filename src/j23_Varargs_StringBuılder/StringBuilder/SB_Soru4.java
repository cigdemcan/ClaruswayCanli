package j23_Varargs_StringBuılder.StringBuilder;

public class SB_Soru4 {
    public static void main(String[] args) {
        int total=0;
        StringBuilder letters=new StringBuilder("abcdefg");
        total+=letters.substring(1,2).length();//1
        total+=letters.substring(6,6).length();//1
        //total+=letters.substring(6,5).length();
        System.out.println("total = " + total);
    }
}
