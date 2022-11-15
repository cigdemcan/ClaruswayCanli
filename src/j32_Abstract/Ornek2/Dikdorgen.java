package j32_Abstract.Ornek2;

public class Dikdorgen extends Sekil {
    private double uzunKenar;
    private double kısaKenar;

    public Dikdorgen(double uzunKenar, double kısaKenar) {//full p `li cons.
        this.uzunKenar = uzunKenar;
        this.kısaKenar = kısaKenar;
    }

    @Override
    public double alanHesapla() {
        return this.uzunKenar*this.kısaKenar;
    }

    @Override
    public double cevreHesapla() {
        return (this.uzunKenar+this.kısaKenar)*2;
    }
}
