package j32_Abstract.Ornek2;

public abstract class Sekil {
    private String name;

    public Sekil() {

    }

    public Sekil(String name) {//p`li parent cons.
       setName( name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract double alanHesapla();
    public abstract double cevreHesapla();
    public  String ciz(){
        return  this.name+ " cizildi";
    }


    @Override
    public String toString() {//obj value larını prınt eder
        return
                         "sekil ismi ='" + this.name + '\'' +
                        "\n sekil alanı :"+this.alanHesapla()+//meth call
                        "\n sekil cevre :"+this.cevreHesapla()+
                        "\n sekil "+this.ciz();//ciz methodu call edildi

    }
}
