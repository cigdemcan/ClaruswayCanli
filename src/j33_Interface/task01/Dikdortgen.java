package j33_Interface.task01;

public class Dikdortgen implements  Sekil {
    @Override
    public int cevre(int... boyut) {
        if (boyut.length == 1){//varags agirlen parametre 1 tane ise kare cevre hesapla
            return (boyut[0] + boyut[0] * 2);
    }else//varargs a girilen parametre 1 tane dğilse dikdorgen cevre hesapla
        return (boyut[0]*4);

}
    @Override
    public int alan(int... boyut) {
        if (boyut.length == 1){//varags agirlen parametre 1 tane ise kare alanı hesapla
            return (boyut[0] + boyut[0] * 2);
        }else//varargs a girilen parametre 1 tane dğilse dikdorgen alanı hesapla
            return (boyut[0]*4);
    }
}
