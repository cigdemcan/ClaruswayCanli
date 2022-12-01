package J99_Lambda;

import java.util.*;

public class LambdaOdev {
    public static void main(String[] args) {
        Universite u01 = new Universite("Bogaziçi", "Matematik", 571, 73);
        Universite u02 = new Universite("istanbul", "Matematik", 622, 77);
        Universite u03 = new Universite("marmara", "Hukuk", 1453, 52);
        Universite u04 = new Universite("Itu", "ucuk muh.", 333, 63);
        Universite u05 = new Universite("Yıldız Teknik", "Gemi", 216, 55);

        List<Universite> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));
        System.out.println("Task09 " + matBlmSys(unv));
        System.out.println("\n     ******      ");
        System.out.println("Task10 " +ogr571fzlUnv(unv));
        System.out.println("\n     ******      ");
        System.out.println("Task11 " +ogrSys1071AzUnv(unv));
    }//maın sonu

    //task 09-->"matematik" bolumlerinin sayisini  print ediniz.
    public static int matBlmSys(List<Universite> unv) {
      return (int) unv.stream().filter(t->t.getBolum().toLowerCase().contains("matematik")).count();
    }


    //task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
     public static OptionalInt ogr571fzlUnv(List<Universite> unv) {
      return unv.stream().filter(t->t.getOgrcSayisi()>571).sorted(Comparator.comparing(Universite::getOgrcSayisi)).mapToInt(t->t.getNotOrt()).max();
}



    //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
    public static OptionalInt ogrSys1071AzUnv(List<Universite> unv) {
        return unv.stream().filter(t->t.getOgrcSayisi()<1071).sorted(Comparator.comparing(Universite::getNotOrt)).mapToInt(t->t.getNotOrt()).min();
    }
}
