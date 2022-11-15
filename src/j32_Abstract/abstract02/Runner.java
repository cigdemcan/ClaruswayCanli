package j32_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {
        Isci maraba1=new Isci();
        maraba1.maasBilgisi();
        maraba1.maasHesapla();

        maraba1.name="Cagla Hanım :)";
        System.out.println(maraba1.name);
        maraba1.sigorta();//abs parent class taki concerete method obj ile call edildi
        IdariPersonel cncCdr=new IdariPersonel();
        cncCdr.name="Dilek hanım";
        System.out.println(cncCdr.name);
        cncCdr.sigorta();
       cncCdr.maasHesapla();
       cncCdr.maasBilgisi();
    }
}
