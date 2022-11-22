package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\ZK\\IdeaProjects\\ClaruswayCanli\\src\\j29_Exceptions\\ebikGabık");
            int k;

            try {
                while ((k = fis.read()) != -1) {
                    System.out.print((char) k);
                }
                System.out.println("agam  içteki try block`tan selamlar");
            } catch (IOException e) {//daosyaya ulaşılır fakat okunamazsa bu catch çalışır
                System.out.println("agam dediğin dosya okunamıyor");
                System.out.println("agam  içteki catch block`tan selamlar");
            }

            System.out.print("agam  dıştaki try block`tan selamlar");


        } catch//dosyaya ulasılamazsa bu catch çalışır
        (FileNotFoundException e) {
            System.out.println("agam dediğin dosya ulaşılamıyor");
            System.out.print("agam  dıştaki catch block`tan selamlar");

        }
    }
}
