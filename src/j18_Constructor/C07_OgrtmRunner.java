package j18_Constructor;

public class C07_OgrtmRunner {
    public static void main(String[] args) {
      C07_Ogrtm hcm=new C07_Ogrtm("sevdenur",11) ;
        System.out.println("hcm.isim = " + hcm.isim);
        System.out.println("hcm.kıdem = " + hcm.kıdem);

        hcm.kıdemHesapla (13);
    }
}
