package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        /*for each loop for loop un gelişmiş halidir
        1.yazım kolaylığı saglar
        2.code okuma kolaylığı
        3.hata yapma riskini azaltır
         */
        List<Integer> sayıList = new ArrayList<>(List.of(16, 5, 2, 33, 22, 27, 41, 24));
        //task->lıst elemanlarını ayrı satırlara print ediniz
        for (int i = 0; i < sayıList.size(); i++) {
            System.out.print(sayıList.get(i) + " ");

        }
        for (Integer a : sayıList) {
            System.out.print(a + " ");
        }
        System.out.println("   *** task02 ***    ");
        // task lıst elemanlarının ilk 3 eleman hariç print ediniz
        for (Integer a : sayıList.subList(3, sayıList.size())) {
            if(a%2==1){
                System.out.println(a+ " ");
            }
        }
        System.out.println("   *** task03 ***    ");
        // task lıst elemanlarının 2 ile 5 index arasındaki elemanlarının toplamını print ediniz
        int toplam=0;
        for (int  a : sayıList.subList(2,6)){
            toplam+=a;
            
    }
        System.out.println("toplam = " + toplam);
}}