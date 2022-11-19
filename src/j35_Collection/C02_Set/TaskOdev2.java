package j35_Collection.C02_Set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class TaskOdev2 {
    /*
    Task->
    return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i return et.


    */
    public static void main(String[] args) {


    LinkedHashSet<String> ulke=new LinkedHashSet<>(Arrays.asList( "Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil"));
    String str1="Germany";
    String str2="USA";

    System.out.println("removing(ulke,str1,str2) = " + removing(ulke, str1, str2));

}

    private static LinkedHashSet removing(LinkedHashSet<String>ulke,String str1,String str2) {
        List<String> yenıLıst=Arrays.asList(str1,str2);
        if (ulke.contains(yenıLıst)){
            ulke.removeAll(yenıLıst);
        }
        return ulke;
    }

}
