package j33_Interface.task01;

public class Cember implements Sekil{
    @Override
    public int cevre(int... boyut) {
        return (int) (2*Pİ*boyut[0]);
    }

    @Override
    public int alan(int... boyut) {
        return (int) (Pİ*boyut[0]*boyut[0]);
    }
}
