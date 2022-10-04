import java.util.Scanner;

public class day05 {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=scan.nextLine().toLowerCase();
        xyzVarMi(str);

    }
    private static boolean xyzVarMi(String str){

        if (str.contains("xyz")){
            return true;
        }else
            return false;
    }
}
