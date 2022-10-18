package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {
        //King of TRİCK-> Array`dan  cevirilen List aray kaynaklı oldugu için array davranişi
        //gösterir boyut sabittir dolayısıyla remove add method çalışmaz
        String arrJavaCan[]={"akif","gamze","Musty","SevdeNur"};
        List<String>listJavaTar= Arrays.asList(arrJavaCan);
        System.out.println("listJavaTar = " + listJavaTar);
        System.out.println("listJavaTar.size()="+listJavaTar.size());//4
        listJavaTar.clear();
        //listJavaTar.add("sefilCan Haluk");//arrayà eleman eklenmez
        //ahanda kral trıck-> lıst data type ArrayLıst tanımlanırsa Rte vermez kaynagı array de olsa lıst davranır
        //boyut esnekliği yapar
        ArrayList<String>listJavaTar1=new ArrayList<>(Arrays.asList(arrJavaCan));
        listJavaTar1.add("sefil Haluk");
        System.out.println("listJavaTar1 = " + listJavaTar1);



    }
}
