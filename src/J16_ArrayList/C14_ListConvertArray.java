package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_ListConvertArray {
    public static void main(String[] args) {
        //listi Arrayà cevirme->tooArray();
        //1. yontem->toArray();parametre olarak String[0]olarak yapılır
        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));
        String arrUlke []=listUlke.toArray(new String[0]);//ulkelıstı  elemanları arrUlke olarak atandı
        System.out.println("arrUlke = " + arrUlke);
        System.out.println("Arrays.toString(arrUlke)" + Arrays.toString(arrUlke));//["Alamanya","Amerigonya","ingiltere","isvec"]

        //2.yontem -> olusturulan Arrayìn data type Object olarak atanır
        //Trick-> Object class java da tum class`ların parent (atası : hz. Adem)O
        //Object class java`da patant```i olmayan tek class`tır(tum vagonları ceken ama cekilmez lokomotif)
        //String Integer Class`lar Object Class child`i olduğu için istenen durumlarda data type olarak object class olarak kullanılır

        Object arrUlkeler []=listUlke.toArray();
        System.out.println("Arrays.toString(arrUlkeler) = " +Arrays.toString(arrUlkeler) );

    }
}
