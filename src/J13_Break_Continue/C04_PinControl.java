package J13_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        //task->String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz
        Scanner sc=new Scanner(System.in);
        String dogruPin="javaCAN" ;
         int girişHakkı=3;
         while (true){
             System.out.println("agam pini giresen");
             String agaPin=sc.nextLine();
             if(agaPin.equals(dogruPin)){
                 System.out.println("agam bugun ballısın gayet basarili");
                 break;
             }else {
                 System.out.println("agam bugun nasipsizsin bır daha dene");
                 girişHakkı--;
                 System.out.println("agam kalan canın:"+girişHakkı);
                 if (girişHakkı==0){
                     System.out.println("agam canın kalmadı bidahkine selametle");
                     break;
                 }
             }
         }

    }
}
