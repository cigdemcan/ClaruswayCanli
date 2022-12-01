package j36_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Kullanici {
    String kimlikNo;
    String adSoyad;
    String adres;
    String telefon;
    Scanner scan = new Scanner(System.in);
    HashMap<String, Kullanici> kulMap = new HashMap<>();
    public Kullanici(String kimlikNo, String adSoyad, String adres, String telefon) {
        this.kimlikNo = kimlikNo;
        this.adSoyad = adSoyad;
        this.adres = adres;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "TaskProjectFields{" +
                "kimlikNo='" + kimlikNo + '\'' +
                ", adSoyad='" + adSoyad + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
 public Kullanici(){

    }
    public void  saveInfo(){
        System.out.println("kimlik numarası giriniz");

        String kimlik = scan.next();
        if (kimlik.length()==4 && kulMap.containsKey(kimlik)){
            System.out.println("dogru kımlık");
        }else System.out.println("tekrar giriniz");

        System.out.println("ad soyad giriniz");
        String adSoyad = scan.next();
        System.out.println("adresgiriniz");
        String adres = scan.next();
        System.out.println("telefon giriniz");
        String telefon = scan.next();
       kulMap.put(kimlik,new Kullanici (kimlik,adSoyad, adres, telefon));

    }
    public void  getInfo(){
        System.out.println("istediğiniz kımlik no giriniz");
        String getKimlik=scan.next();
        if (kulMap.containsKey(getKimlik)){
            System.out.println("aradıgınız kısı dogru");
        }

    }
    public  void  removeInfo(){
        System.out.println("istediğiniz kımlik no giriniz");
        String getKimlik=scan.next();
        System.out.println(kulMap.containsKey(getKimlik) ? kulMap.remove(getKimlik) : "girdiğiniz lımse yok");

    }


    public  void  selectOption(){

    }
}
