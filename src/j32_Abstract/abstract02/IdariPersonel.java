package j32_Abstract.abstract02;

public class IdariPersonel extends Personel{
    @Override//mecburen ımplent edilmeli
    public void maasHesapla() {//personel parent class tan ovvirrede edilen abs. class
        System.out.println("agam ıdarecimize +120 gayme veriliyor");
    }

    @Override

    public  void  sigorta(){//personel parent class dan ovverride edilen abs method
        System.out.println("agam cınıcık code personel full sigorta");
   }

    @Override//mecburen ımplent edilmeli
    public void maasBilgisi() {//personel parent class tan ovvirrede edilen abs. class
        System.out.println("agam cıncık code yazan ıdari personele ekstıradan ıkramiye");
    }
}
