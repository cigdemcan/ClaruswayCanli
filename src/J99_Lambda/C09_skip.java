package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C09_skip {
    public static void main(String[] args) {
        List<String > menu = new ArrayList<String>(Arrays.asList("küşleme","soğanlı","trileçe","bicibici","büryan","melemen","cacix","kokerç","yağlama","güveç","arabAşı","tantuni"));
        System.out.println("\n     ******      ");
        ilkİkiHrcSonHarf(menu);//[trileçe, bicibici, tantuni, büryan, melemen, cacix, kokerç, güveç, soğanlı, arabAşı]

        System.out.println("\n     ******      ");


//skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış return eder.
        //akıs n den sonra az eleman içeriyorsa skip(n)meth dan sonra boş işlem  döndürür
    }//maın sonu

    // Task : list elemanlarini son harfine göre siralayıp ilk iki eleman hariç kalan elemanlari print ediniz.
    public static void ilkİkiHrcSonHarf( List<String > menu){
        System.out.println(Arrays.asList(menu.stream().
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//akıstakı elemanların son karakterine göre sıralandı
                skip(2).//akıstakı ılk 2 eleman akıstan cıkarıldı
                toArray()));//akıs elemanları bır arraya atandı

    //2.yol
        menu.stream().
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                skip(2).forEach(t-> System.out.println(t +" "));
    }
    }

