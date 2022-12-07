package j10_StringManipulations;

import j26_Inheritance.task01.A;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class stringTersCevırmeUgurHoca {
    public static void main(String[] args) {


        String str = "JavaCAN & JAVATAR";
        method1ForLastIndex(str);
        method2ForFirsIndex(str);
        method3WhileileSubstring(str);
        method4StringBuilder(str);
        method5StringBuffer(str);
        method6StringArray(str);
        method7charArray(str);
        method8ByteArray(str);
        method9ArrayList(str);
        method10Recursion(str);
        method11Lambda(str);

    }

    private static void method11Lambda(String str) {
        System.out.println(Stream.of(str).map(t -> t.split("")).flatMap(Arrays::stream).reduce("", (s, c) -> c + s));

    }

    private static void method10Recursion(String str) {
        if (!str.isEmpty()) {


            System.out.println(str.charAt(str.length() - 1));
            method10Recursion(str.substring(0, str.length() - 1));
        } else System.out.println();//dummy

    } private static void method9ArrayList(String str) {
        ArrayList<String>list=new ArrayList<>(List.of(str.split("")));
        Collections.reverse(list);
        System.out.println("Arraylıst ile" +list);
        String[]array=list.toArray(new String[0]);
        System.out.println("Arraylıst ile" +String.join("",array));
        //System.out.println("Arraylıst ile" +String.join("!",array));
    }

    private static void method8ByteArray(String str) {
        byte[]bytes=str.getBytes();
        System.out.println("stringın son halı"+ Arrays.toString(bytes));
        for (int l = 0, r= str.length()-1;l<r ;l++ ,r--) {
            byte temp=bytes[l];
            bytes[l]=bytes[r];
            bytes[r]=temp;

        }
        System.out.println("byte array ile " +new String(bytes));
    }

    private static void method7charArray(String str) {
        char[]charArray=str.toCharArray();
        System.out.println("charArray ile");
        for (int i = charArray.length-1; i >=0 ; i--) {
            System.out.print(charArray[i]);


        }
        System.out.println();//dumy
    }

    private static void method6StringArray(String str) {
        String[]strArray=str.split("");
        System.out.print("StrıngArray ile");
        for (int i = strArray.length-1; i >=0 ; i--) {
            System.out.print(strArray[i]);


        }
        System.out.println();//dumy
    }

    private static void method5StringBuffer(String str) {
        StringBuffer sf=new StringBuffer();
        System.out.println("StringBuffer ile " +sf.reverse());

    }

    private static void method4StringBuilder(String str) {
        StringBuilder sb=new StringBuilder();
        System.out.println("StringBuilder ile " +sb.reverse());
    }

    private static void method3WhileileSubstring(String str) {
        String s5 = "";
        while (str.length()>0){
            s5+=str.charAt(str.length()-1);
            str=str.substring(0,str.length()-1);
        }
        System.out.println("While ile: "+s5);
    }

    private static void method2ForFirsIndex(String str) {
        String s3 = "";
        String s4 = "";
        for (int i = 0; i < str.length(); i++) {


        s3=str.charAt(i)+s3;
        s4=str.substring(i,i+1)+s4;
    }
        System.out.println("for loop First index charAt ile: "+s3);
        System.out.println("for loop First index  substring ile: "+s4);
}
    private static void method1ForLastIndex(String str) {
        String s1="";
        String s2="";
        for (int i = str.length()-1; i >=0; i--) {
            s1+=str.charAt(i);
            s2+=str.substring(i,i+1);


        }
        System.out.println("for loop CharAt ile: "+s1);
        System.out.println("for loop substring  ile: "+s2);
    }

}