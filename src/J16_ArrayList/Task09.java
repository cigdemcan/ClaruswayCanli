package  J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
ArrayList<Integer>List=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
ArrayList<Integer>kareLıst=new ArrayList<>();
int tumKare =0;
        for (int i = 0; i < List.size(); i++) {
            kareLıst.add(List.get(i)*List.get(i));
            tumKare+=List.get(i)*List.get(i);
        }

        System.out.println("kareLıst = " + kareLıst);
        System.out.println("tumKare = " + tumKare);
    }
}

