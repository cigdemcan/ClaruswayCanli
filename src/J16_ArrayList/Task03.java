package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        ArrayList<Integer> ListSayi = new ArrayList<>(Arrays.asList(1, 24, 23, 14, 19, 60, 1, 55, 27, 1, 38));
        Scanner sc=new Scanner(System.in);
        System.out.println("agam syı gir");
        int ara=sc.nextInt();
        boolean varMi=false;
        for (int i = 0; i <ListSayi.size(); i++) {
            if(ListSayi.get(i)==ara){
                varMi=true;
                System.out.println("aradıgın sayı mevcut" );
                break;
            }

        }if(!varMi)
            System.out.println("aradıgın sayı maalesf");
    }
}