package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {
       ArrayList<Integer>sayi=new ArrayList<>(Arrays.asList(3, 5, 1, 2, 7, 9, 2, 3, 5, 7));
        ArrayList<Integer> sayi2 = new ArrayList<>();
        for (int i = 0; i <= sayi2.size(); i++) {
           int toplam=0;
           if ((i==0)){
               sayi2.add(sayi.get(i));
           }else if(i==1){
               sayi2.add((sayi.get(i)+sayi.get(i+1)));
           }else if (i==2){
               sayi2.add((sayi.get(i+1)+sayi.get(i+2)+sayi.get(i+3)));
           }else if (i==3){
               sayi2.add((sayi.get(i+1)+sayi.get(i+2)+sayi.get(i+3)+sayi.get(i+4)));
           }
        }
        System.out.println(sayi2);
           }
        }



