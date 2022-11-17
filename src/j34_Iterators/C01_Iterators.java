package j34_Iterators;

import java.util.*;



public class C01_Iterators {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("nur", "gamze", "erol", "bekir"));
        System.out.println("l1 list ilk hali" + l1);
        //l1 elemanlarını for loop kullanarak prınt ediniz
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i) + " ");
        }
        System.out.println("   ****   ");

        //l1 elemanlarını for each kullanarak prınt ediniz
        for (String w : l1) {
            System.out.print(w + " ");


        }
        System.out.println();
        System.out.println("   ***   ");

        //l1 herbir elemanını for loop ile update edip prınt ediniz

        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i) + ":-)");


        }
        System.out.println("l1 :update sonrası:" + l1);;//[Nur :-) , Gamze :-) , Erol :-) , Bekir :-) ]
        System.out.println();
        System.out.println("   ***   ");


        //l1 herbir elemanını for each loop ile update edip prınt ediniz
        for (String w : l1) {
            w += ":-(";
            System.out.println("l1 :update sonrası:" + l1);;//[Nur :-) , Gamze :-) , Erol :-) , Bekir :-) ]
            /*
            index desteklemeyen yapılarda tekrarlayan aksiyon için foor each loop update yapamayabilir yukarıdakı task de oldugu gibi
            bu durumda java ıterator ınterface den tanımlanacak variable ile tekrarlayan aksiyonlar index olmadan yapılır
             */
            System.out.println();
            System.out.println("   ***   ");

            Iterator<String>it1=l1.iterator();//ıterator interfaceden it1 variable tanımlandı .Atama olarak l1 elemanları atandı
            while (it1.hasNext()){
                //hasNext()->it1 elemanları için pointer old yerde eleman varsa true yoksa false verir ve poınter
                // bir sonraki eleman onune koyulur
               //next()->listìn poınter onundeki elemanını return eder
                System.out.println(it1.next() + " ");
            }
            List<String> l2 = new ArrayList<>(Arrays.asList("baran", "gülsüm", "AKIF", "nazım"));
           // l2 elemanlarını ıterator ile silip prınt ediniz
            System.out.println("ıterator oncesi l2 :"+l2);
            System.out.println();
            System.out.println("   ***   ");
            Iterator<String>it2=l2.iterator();
            while (it2.hasNext()){
                it2.next();
                it2.remove();
            }
            System.out.println("ıterator remove sonrası l2 :"+l2);// []

            // l3 elemanlarını ıterator ile :-) set edip  prınt ediniz
            List<String> l3 = new ArrayList<>(Arrays.asList("baran", "gülsüm", "AKIF", "nazım"));
            ListIterator<String>it3 =  l3.listIterator();
            System.out.println("ıterator oncesi l3 :"+l3);//[Baran, Gülsüm, Akif, Nazım]
            while (it3.hasNext()){
                it3.set( it3.next().toUpperCase()+":-)");
        }
            System.out.println("ıterator sonrası l3 :"+l3);// [Baran :-), Gülsüm :-), Akif :-), Nazım :-)

            // l3 elamanlarının ilk harfi buyuk kln 3 hafi *** karakteri ve l4 listi ekleyip print ediniz
            ListIterator<String> l4 = l3.listIterator();//tekrar iterator yapısı tanımlandı

            while (l4.hasNext()) {
                l4.set(l4.next().toUpperCase().charAt(0) + "***");//next()ilen l4 elamanbı ilk harf byk kalan 3 harf*** le set edildi
                l4.add(l4.toString());//tekrardaki updatebedilen l3 e l4 add edildi
            }


            System.out.println("Listiterator  set ve add sonrası l3 : " + l3);// [Baran :-), Gülsüm :-), Akif :-), Nazım :-)
    }
}}