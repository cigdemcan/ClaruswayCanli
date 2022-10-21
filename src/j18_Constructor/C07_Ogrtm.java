package j18_Constructor;

public class C07_Ogrtm {
    //fields
    String isim;
    int tecrube;
    int kıdem = 5;

    public C07_Ogrtm(String isim, int tecrube) {
        this.isim = isim;
        this.tecrube = tecrube;
    }

    public void kıdemHesapla(int i) {//int p`li void method
        System.out.println("agam kıdemin :" + (kıdem * 2));//method parametresi değeri kıdeme atanır
        System.out.println("agam kıdemın:" + (this.kıdem * 2));//
    }
}
