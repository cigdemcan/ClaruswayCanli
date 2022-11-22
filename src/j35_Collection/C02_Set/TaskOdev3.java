package j35_Collection.C02_Set;

import java.util.HashSet;
import java.util.List;

public class TaskOdev3 {
    public static void main(String[] args) {
         /*
    Task
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı

    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */
        HashSet<Integer> set = new HashSet<Integer>(List.of(4,2,3,1,7));
        System.out.println("Setin eleman sayısı: "+totalCount(set));
    }
    private static int totalCount(HashSet<Integer> set) {
        return set.size();
    }

}

