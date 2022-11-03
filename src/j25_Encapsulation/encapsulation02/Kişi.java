package j25_Encapsulation.encapsulation02;

public class Kişi {//pojo class
    //fields
    String ad;
    String soyad;
   private String password;
   private int yas;

    public Kişi(String ad, String soyad, String password, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.password = password;
        this.yas = yas;
    }

    public String getPassword() {
        return password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas =Math.abs( yas);
    }
}
