package j33_Interface;

public class Runner {
    public static void main(String[] args) {
        Sahın dgshn=new Sahın();
        dgshn.ebat();
        dgshn.jant();
        dgshn.kapı();
        dgshn.kaporta();
        dgshn.koltuk();
        dgshn.motor();
        System.out.println(dgshn.sisLamp());//default concere method obj ile call edildi
        dgshn.sunroof();
        dgshn.yakıt();
        System.out.println(dısDonanım.RENK);
       // içDonanım.KUMAS="deri";//CTE final variable atama yapılmaz
        System.out.println(içDonanım.RENK);
        System.out.println(Lastik.RENK);
        System.out.println(Lastik.RENK);//aynı isimli variable interface ile caal edilir
        System.out.println(içDonanım.KUMAS);
        System.out.println(içDonanım.MUSIC);
        dısDonanım.anten();//static concrete method interface name call
    }
}
