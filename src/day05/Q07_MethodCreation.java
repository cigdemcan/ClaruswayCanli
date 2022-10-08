package day05;

public class Q07_MethodCreation {/*iki integer sayının eşitliğini kontrol eden method yazınız
num1=num2=>true*/

    public static void main(String[] args) {
        int num1=25;
        int num2=23;
        System.out.println(kontrol(num1,num2));

    }

    private static boolean kontrol(int num1, int num2) {
        boolean flag=false;
        if(num1==num2){
            flag=true;
        }return flag;
    }
}
