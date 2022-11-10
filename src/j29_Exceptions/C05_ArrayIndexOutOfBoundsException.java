package j29_Exceptions;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException-:bu arraylarde olmayan bir index elemaı ile işlem yapıldığında oluşan
       // RTE Exception
        int arr[]={24,27,38,41,54};
        System.out.println(arr[0]);//24
        System.out.println(arr[7]);//ArrayIndexOutOfBoundsException
        try { System.out.println(arr[7]);
            System.out.println("agam try block da bu yazıyı okuduysan  exce. fırlatmadı komut sorunsuz");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("agam olmayan array elemanı istiyorsun");
            System.out.println("agam catch block da bu yazıyı okuduysan  exce. fırlatmadı komut sorunsuz");
        }
        try { System.out.println(arr[2]);//38
            System.out.println("agam try block da bu yazıyı okuduysan  exce. fırlatmadı komut sorunsuz");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("agam olmayan array elemanı istiyorsun");
            System.out.println("agam catch block da bu yazıyı okuduysan  exce. fırlatmadı komut sorunsuz");
        }
        System.out.println("agam sorun handle eildi devamkee");
    }
}
