package j09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
     //TASK->girilen ayın hangi mevsimde olduğunu print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("agam bir ay gir bakam");
        int ayNo=sc.nextInt();
        switch (ayNo){
            case 12 :

            case 1:

            case 2 :
                System.out.println("kış");
                break;

            case 3 :

            case 4 :

            case 5 :
                System.out.println("ilkbahar");
                break;
            case 6 :

            case 7 :

            case 8 :
                System.out.println("yaz");
                break;
            case 9 :

            case 10:

            case 11 :
                System.out.println("sonbahar");
                break;

            default:
                System.out.println("yanlıs ifade girdınız");




        }


















    }
}
