package J99_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LamdaOdev2 {

        public static void main(String[] args) throws IOException {




        //TASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  print ediniz..
     System.out.println("\n TASK05");
            Path hlk=Path.of("src\\J99_Lambda\\haluk");
            Stream<String>akis= Files.lines(hlk);
            Files.lines(Paths.get("src\\J99_Lambda\\haluk")) .map(t->t.split(" ")).flatMap(Arrays::stream).distinct().forEach(t-> System.out.println(t+ " "));
            System.out.println();//dummy

            //TASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  print ediniz..
            System.out.println("\n TASK06");
            Files.lines(Path.of("src\\J99_Lambda\\haluk")).map(t-> t.split(" ")).
                    flatMap(Arrays::stream).sorted().forEach(t-> System.out.println(t +" "));

        //TASK 07 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
            System.out.println("\n TASK07");
            Files.lines(Path.of("src\\J99_Lambda\\haluk")).map(String::toLowerCase).map(t-> t.split(" ")).
                    flatMap(Arrays::stream).filter(t->t.contains("basarı")).count();
               System.out.println();//dumm

        //TASK 08 --> haluk.txt dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
            System.out.println("\n TASK08");
               Files.lines(Path.of("src\\J99_Lambda\\haluk")).map(String::toLowerCase).map(t->t.split(" ")).flatMap(Arrays::stream).filter(x->x.contains("a")).count();
               System.out.println();//dummy

        //TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
            System.out.println("\n TASK09");
               Files.lines(Path.of("src\\J99_Lambda\\haluk")).map(String::toLowerCase).map(t->t.split(" ")).flatMap(Arrays::stream).filter(x->x.contains("a")).forEach(t-> System.out.println(t +" "));
               System.out.println();//dumm

        //TASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini print ediniz.
            System.out.println("\n TASK010");
               System.out.println(Files.lines(Path.of("src\\J99_Lambda\\haluk")).map(String::toLowerCase).map(t -> t.split("")).flatMap(Arrays::stream).distinct().count());
               System.out.println();//dumm

        //TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini print ediniz.
            System.out.println("\n TASK11");
               System.out.println(Files.lines(Path.of("src\\J99_Lambda\\haluk")).map(String::toLowerCase).
                       map(t -> t.split(" ")).flatMap(Arrays::stream).distinct().count());
               System.out.println();//dumm

        //TASK 12 --> haluk.txt dosyasinda  farkli kelimeleri print ediniz
            System.out.println("\n TASK12");
               Files.lines(Path.of("src\\J99_Lambda\\haluk")).map(String::toLowerCase).map(t -> t.split(" ")).flatMap(Arrays::stream).distinct().forEach(t-> System.out.println(t +" "));
               System.out.println();//dummy


}}