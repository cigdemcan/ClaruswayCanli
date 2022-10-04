package J11_MethodCreation;

public class C04_MethodDepo {
    //main method olmayacak
    /*her classta main method mecburiyeti yoktur belirli aksiyonlara özel claslarda tanımlanabilir*/
    public static void geçmeNotu(int not){
       if(not>=85) {
           System.out.println("agam cook başrilisin");
       } else if (not>=70) {
           System.out.println("agam başarılı");
       } else if (not>=60) {
           System.out.println("agam sadece geçtin");
       } else if (not>=40) {
           System.out.println("agam ucuz yırttın");
       }else System.out.println("agam fena çaktın");
    }
}
