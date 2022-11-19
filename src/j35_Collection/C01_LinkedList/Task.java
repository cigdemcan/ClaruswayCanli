package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
        task->node degerleri "yakup","javacan","javatar","teykınay" olan bır lınkedlıst create ediniz
        girilen bir string degeri lınked lıstte varlıgını kontrol edip varsa silip "agam eleman halledildi"
         yoksa "agam aradığınız kişiye ulasılamadı"prınt eden code creata ediniz

         */

        LinkedList<String>ll1=new LinkedList<>(Arrays.asList("yakup","javacan","javatar","teykınay"));
        Scanner sc=new Scanner(System.in);
        System.out.println("agam kıme bakmıstınız :");
        String aganınAdamı=sc.next();

        System.out.println(ll1);

        if(ll1.remove(aganınAdamı)){//true ->istenen node var ve silindi
            System.out.println("agam eleman halledildi");
            System.out.println("aganın adamı hallolduktan sonra :"+ll1);

        }else System.out.println("agam aradığınız kişiye ulasılamadı");
    }
}
