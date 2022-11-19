package j35_Collection.C01_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

  /*
        LinkedList .....
        1- LinkedList'de elemanlar "data" ve "adress" olmak uzere iki ksımdan oluşur ve eleman yerine "node" olarak tanımlanır.
        2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran head node tanımlanmıştır.
        3- LinkedList'te son node adres kısmı null olan sadece data bulunduran tail node tanımlanmıştır.
        4- ArrayList searching LinkedList node ekleme ve silmede daha avantıjlıdır.Linkedlist eleman bulmada index yapısı olmadıgı için başarısıdır.
        5-LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşümülebilir
        6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...) olmamasına diakkat edilmeli
            Ancak obj DataType olarak parent interface tanımlanabilir.
        7- LinkedList clss iki tane parent interface'den(List,Queue) implemet etmiştir.
         */

        LinkedList<String>ll1=new LinkedList<>(Arrays.asList("ebubekır","gulsum","adem","ilker","merve"));//LınkedLıst->declare+
        //LınkedList prınt
        System.out.println("ll1 = " + ll1);// [ebubekır, gulsum, adem, ilker, merve]
        //LınkedList prınt
        ll1.add("ugur");
        System.out.println(ll1);//[ebubekır, gulsum, adem, ilker, merve, ugur]
        ll1.add(2,"Abdulaziz");
        System.out.println("ll1 = " + ll1);//[ebubekır, gulsum, Abdulaziz, adem, ilker, merve, ugur]
        ll1.addFirst("javacan");
        System.out.println(ll1);//[javacan, ebubekır, gulsum, Abdulaziz, adem, ilker, merve, ugur]
        ll1.addLast("javatar");
        System.out.println(ll1);//[javacan, ebubekır, gulsum, Abdulaziz, adem, ilker, merve, ugur, javatar]

        List<String> ll2=new LinkedList<>(Arrays.asList("fatih","erol","nur"));//Data type interface List olan Lınkedlıst
        ll1.addAll(ll2);
       // ll1.addAll("agam");//CTEparametre Col olmazsa
        System.out.println("ll1 = " + ll1);//[JavaCAN, Ebubekir, Gülsüm, Abdulaziz, Adem, İlker, Merve, ugur, JavaTAR, Fatih, Erol, Nur]
        ll1.addAll(3,ll2);
        System.out.println(ll1);//[JavaCAN, Ebubekir, Gülsüm, Fatih, Erol, Nur, Abdulaziz, Adem, İlker, Merve, ugur, JavaTAR, Fatih, Erol, Nur]
    }
}
