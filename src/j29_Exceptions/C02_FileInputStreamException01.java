package j29_Exceptions;/*

     Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.
     bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surumlara karşılk gelen hatalara Checked Exception denir
     Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.


    Bir kod yazilirken olasi exception'lar ongorulup
    exception olustugunda Java'nin ne yapmasini istedigimiz
    belirtilmelidir.


         1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

   2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
Class'inin parent class Hz.Adem*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException01 {//hz. Nuh IO işlemleri en parent class exception
    public static void main(String[] args) throws IOException {//read () method import öncesi child exception

  //  public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("C:\\Users\\ZK\\IdeaProjects\\ClaruswayCanli\\src\\j29_Exceptions\\ebikGabık");
        //ilgili dosyaya ulaşmak için fis obj tanımlandı parametre olarak ulassılacak dosya yolu (path)girildi
        //FileNotExceptıon ->adres yanlışsa controlu
        /*
        Eğer bir methodda cheked (CTE riski olan exec.)exception varsa method signature (method name sonraki bölüm)hata uyarısı altı kırmızı
        çizgi verir.komutun derlenmesine izin vermez ve kod üzerine geldiğinde Add.. exception handle etme tavsiye eder otomatik throws exce.
        eklenir. bu sekilde methodu call eden komutlar try-catch alınması garanti edilmş olur.
         */
        int k;
        while ((k=fis.read())!=-1){//IOException ->evde yoksa controlu
            System.out.print((char)k);//k int asççi olan file değeri char içi
    }
}
}