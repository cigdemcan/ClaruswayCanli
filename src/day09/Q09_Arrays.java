package day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q09_Arrays {
    public static void main(String[] args) {

    /*
     If the list has 12 as element, change all 12s to 21
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */
        ArrayList<Integer> name = new ArrayList<>(List.of(12, 11, 12, 15, 12, 34, 43));
        System.out.println(name);

        if (name.contains(12)) {
            Collections.replaceAll(name,12,21);
            System.out.println(name);
        }


    }
}
