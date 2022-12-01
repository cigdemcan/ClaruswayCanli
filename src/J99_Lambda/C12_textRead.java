package J99_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class C12_textRead {
    public static void main(String[] args) throws IOException {
        // Task 01->haluk dosyasını okuyunuz(consola prınt ediniz.)
        System.out.println("\n TASK01-->haluk dosyasını okuyunuz");

        Path hlk = Path.of("src\\J99_Lambda\\haluk");
        Stream<String> akıs = Files.lines(hlk);
        Stream<String> akıs1 = Files.lines(Path.of("src/J99_Lambda/haluk"));
        akıs.//erişimi verilen dosyadaki satırlar akısa alındı
                forEach(System.out::println);//akıstakı satırlar (lines)print edildi

        // Task02-> haluk.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle print ediniz.)
        System.out.println("\n TASK02-->haluk.txt dosyasını buyuk harflerle okuyunuz");
        Files.lines(Paths.get("src/J99_Lambda/haluk")).map(String::toUpperCase).forEach(System.out::println);

   // task03-->haluk.txt dosyasindaki ilk satiri kucuk harflerle print ediniz..
     System.out.println("\n TASK03-->haluk.txt dosyasındaki ilk satırı kucuk harflerle prınt ediniz");
     Files.lines(Paths.get("src/J99_Lambda/haluk")).map(String::toUpperCase).
            // limit(1).
        findFirst();
   // forEach(System.out::println);

//TASK 04 --> haluk dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
        System.out.println("\n TASK04-->haluk dosyasında \"basari\" kelimesinin kac satırda gectiğini prınt ediniz");
        Files.lines(Paths.get("src/J99_Lambda/haluk")).map(String::toLowerCase).filter(t->t.contains("basarı")).
                count();//akısdakı elemanlar saydırıldı

    }
}