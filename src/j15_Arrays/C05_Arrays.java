package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //Array copy...copyOf(arr,newLenght);->girilen arr yınnewlenght kadar ilk elemanı kopyalar

        int sayı[]={63,21,47,27,35,12,36,31,46,24};
        int yenıArr[]= Arrays.copyOf(sayı,5);
        System.out.println("sayıdan 5 eleman kopyalnanyeni arr:"+Arrays.toString(yenıArr));//[63,21,47,27,35]
        int baskaArr[]=Arrays.copyOfRange(sayı,3,8);//3 dahil 8 hariç index elemanlar kopyalanır
        System.out.println("sayı arr den özel kopyalanan baska Arr:"+Arrays.toString(baskaArr));//[27,35,12,36,31]
        //Arrrayì belirli bir eleman ile update(set) etme.. fill(arr,value);

        Arrays.fill(sayı,99);
        System.out.println("sayı arri 99 ile fullenmiş halı:"+Arrays.toString(sayı));
        Arrays.fill(sayı,3,7,33);//3.4.5.6. index elemanlar 33 ile update edildi
        System.out.println("sayı arri 3 ile 7 ındex arası 33 ile fullenmiş halı:"+Arrays.toString(sayı));

    }
}
