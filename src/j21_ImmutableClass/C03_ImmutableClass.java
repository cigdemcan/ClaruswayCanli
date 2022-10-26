package j21_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClass {
    public static void main(String[] args) {
/*
  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
  BigDecimal, BigInteger java'da immutable sınıflara örnek olarak gösterilebilir.
        Date, StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
 */
        String name="Merve";
        System.out.println(name);//merve
        name.concat("javacan");
        System.out.println(name);//merve ->String name variable meth sonrası aynı değerde kaldi:ımmutable

        List<String>isimList=new ArrayList<>();//boş string list
        isimList.add("Fatih");
        isimList.add("erkan");
        isimList.add("serhat");
        isimList.remove(1);
        isimList.set(1,"javacan");

        System.out.println("isimList = " + isimList);
    }
}
