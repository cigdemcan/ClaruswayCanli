package j23_Varargs_StringBuılder.StringBuilder;

public class SB_Soru1 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        sb1.append("aaa").insert(1,"bb").insert(4, "ccc");
        System.out.println("sb1 = " + sb1);
        
    }
}
