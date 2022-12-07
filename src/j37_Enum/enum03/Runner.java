package j37_Enum.enum03;

import java.util.ArrayList;

public class Runner {
    /*  TASK :
1- Bir Kitap calss'i create ediniz, fields : name ve kategori(Enum)
2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
3- 3 kitap tanımlayınız bir ArrayList e atınız.
4- bir kategoriye gore listeletiniz.

*/
    public static void main(String[] args) {
        Kıtap ktb1=new Kıtap();
        ktb1.name="leyla mecnunun nesi oluyor?";
      //  ktb1.kategori="Roman";
        ktb1.kategori=KitapKategori.ROMAN;

        Kıtap ktb2=new Kıtap();
        ktb1.name="agam benden kusleme";
      //  ktb1.kategori="roman";
        ktb1.kategori=KitapKategori.ROMAN;

        Kıtap ktb3=new Kıtap();
        ktb1.name="Halukca ebık gabık";
      //  ktb1.kategori="Rooman";
        ktb1.kategori=KitapKategori.ROMAN;

        ArrayList<Kıtap>kutubhane=new ArrayList<>();
        kutubhane.add(ktb1);
        kutubhane.add(ktb2);
        kutubhane.add(ktb3);

       // for (Kıtap k:kutubhane){
       //     if (k.kategori.equals("roman"))
       //         System.out.println(k.name);
        for (Kıtap k:kutubhane){
            if(ktb1.kategori==KitapKategori.ROMAN)
                System.out.println(k.name);
        }
    }
}
