package j35_Collection.C02_Set;

import jdk.internal.jimage.ImageReader;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;




public class TaskOdev {
   public static void main(String[] args) {

   /* 
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
   olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
    */
    
     
        HashSet<String> meyveler = new HashSet<String>(List.of("banana", "strawberry", "kiwi", "pineapple"));
        String myv = "banana";
        String myv2 = "peach";
        System.out.println(meyveler);
        System.out.println("changeSet(meyveler,myv,myv2) = " + changeSet(meyveler, myv, myv2));


    }

    private static HashSet changeSet(HashSet<String> meyveler, String myv, String myv2) {
        if (meyveler.contains(myv)) {
            meyveler.remove(myv);
            meyveler.add(myv2);

        }
        return meyveler;

  





    }}