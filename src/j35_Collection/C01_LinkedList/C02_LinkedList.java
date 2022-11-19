package j35_Collection.C01_LinkedList;

import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object>list=new LinkedList<>();//data type Object(Hz.Adem)
        //bad practıce app.cok yavaslar tavsiye edilmez
        list.add("nazım");
        list.add("$");
        list.add(1453);
        System.out.println(list);//[nazım, $, 1453]


    }
}
