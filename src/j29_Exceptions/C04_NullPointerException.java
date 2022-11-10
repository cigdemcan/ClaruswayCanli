package j29_Exceptions;

public class C04_NullPointerException {
    //NullPointerException->null atamsı yapılan bir Stringe length()method run edildiğinde oluşan RTE exception
    public static void main(String[] args) {


        String str = "";
        System.out.println("str.length() = " + str.length());//0
        String str1=null;

        // System.out.println("str1.length() = " + str1.length());
        try {
            System.out.println("str1.length() = " + str1.length());//excep. try blok kırılır catch blok run olur
            System.out.println("agam try block da bu yazıyı okduysan exce. fırlatmadı komut sorunsuz");

        }catch (NullPointerException e){
            System.out.println("agam hele dutluktaki String boyutu mu hesaplanır");
        }
        try {
            System.out.println("str.length() = " + str.length());//excep.olmadığı için try bloc tamalanır catch blok çalışmaz
            System.out.println("agam try block da bu yazıyı okduysan exce. fırlatmadı komut sorunsuz");

        }catch (NullPointerException e){
            System.out.println("agam hele dutluktaki String boyutu mu hesaplanır");
        }



        System.out.println("agam sorun handle edildi devamkeee");
    }
}