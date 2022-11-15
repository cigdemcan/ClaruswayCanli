package j32_Abstract.Ornek2;

public class Runner {
    public static void main(String[] args) {
        Dikdorgen dd =new Dikdorgen(24,7);
        dd.setName("dikdortgen");
        //dd.cevreHesapla();//
       // dd.alanHesapla();
        System.out.println(dd.ciz());
        System.out.println(dd);

        Cember c1=new Cember(39);
        c1.setName("cember");
        System.out.println(c1);


    }
}
