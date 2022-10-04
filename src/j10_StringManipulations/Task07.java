package j10_StringManipulations;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        //girilen string içindeki istenen index deki karekteri print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str=sc.next();
        System.out.println("istediğin karekter için index gir");
        int index=sc.nextInt();
        if(str.length()>index) {
            System.out.println(str.substring(index,index+1));
        }else System.out.println("girdiğiniz metinde olmayan index istiyorsunuz");




    }
}
