package J99_Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class C10_object {
    /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
 */
    public static void main(String[] args) {
        Universite u01 = new Universite("Bogaziçi", "Matematik", 571, 73);
        Universite u02 = new Universite("istanbul", "Matematik", 622, 77);
        Universite u03 = new Universite("marmara", "Hukuk", 1453, 52);
        Universite u04 = new Universite("Itu", "ucuk muh.", 333, 63);
        Universite u05 = new Universite("Yıldız Teknik", "Gemi", 216, 55);

        List<Universite> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));
        System.out.println("Task01" + notOrt74Byk(unv));//false
        System.out.println("\n     ******      ");
        System.out.println("Task02" + sayı110danAz(unv));//true
        System.out.println("\n     ******      ");
        System.out.println("Task03" + enAzBirMat(unv));//true
        System.out.println("\n     ******      ");
        System.out.println("Task04" + OgSysTrsSıra(unv));
        System.out.println("\n     ******      ");
        System.out.println("Task05 " + notOrtTersSıra(unv));
        System.out.println("\n     ******      ");

        System.out.println("Task06 " + ogrSayısıAzIkıncı(unv));

        System.out.println("\n     ******      ");

        System.out.println("Task07" + notOrt63BykOgrSysToplam(unv));//1193
        System.out.println("\n     ******      ");

        System.out.println("Task08" + ogrSys333denBykNotOrt(unv));

    }//maın sonu

    //task01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    public static boolean notOrt74Byk(List<Universite> unv) {
        return unv.stream().allMatch(t -> t.getNotOrt() > 74);
    }

    //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
    public static boolean sayı110danAz(List<Universite> unv) {
        return unv.stream().allMatch(t -> t.getOgrcSayisi() >= 110);
    }

    //task03->>universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean enAzBirMat(List<Universite> unv) {
        return unv.stream().anyMatch(t -> t.getBolum().toLowerCase().contains("mat"));
    }

    //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static List<Universite> OgSysTrsSıra(List<Universite> unv) {
        return unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi).reversed()).
                collect(Collectors.toList());//akıstakı elemanlar liste atandı
        // collect(Collectors.coll)->Collector class `tan coll. meth.ile akıs elemanları atanır
    }

    //task05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
    public static List<Universite> notOrtTersSıra(List<Universite> unv) {
        return unv.stream().sorted(Comparator.comparing(Universite::getNotOrt).reversed()).limit(3).
                collect(Collectors.toList());//akıstakı elemanlar liste atandı
        // collect(Collectors.coll)->Collector class `tan coll. meth.ile akıs elemanları atanır

    }
    //task06-->ogrc sayisi en az olan 2. universite'yi  print ediniz.
    public static List<Universite> ogrSayısıAzIkıncı(List<Universite> unv) {
        return unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi)).limit(2).skip(1).
                collect(Collectors.toList());

}
//task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.
    public static int notOrt63BykOgrSysToplam(List<Universite> unv){
     return    unv.stream().filter(t->t.getNotOrt()>63).
             mapToInt(t->t.getOgrcSayisi()).//akıstakı elemanların data type nı parametredeki değere  göre apdate eder
             sum();//akışdaki elemanlar toplanır
    }
//task 08--> ogrencı sayısı 333 den buyuk olan universite'lerin not ort `larının ortalamasını bulunuz.
public static OptionalDouble ogrSys333denBykNotOrt(List<Universite> unv){
    return    unv.stream().filter(t->t.getOgrcSayisi()>333).
            mapToDouble(t->t.getNotOrt()).
            average();//ortalama alır

}}