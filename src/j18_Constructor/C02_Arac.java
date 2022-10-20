package j18_Constructor;

public class C02_Arac {
   // fields
    String marka;
    String model;
   int km;
    double motorHacim;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yıl;


    public static <myCar> void main(String[] args) {
        C02_Arac arac1=new C02_Arac();//default cons. ile arac1 obj create edildi
        arac1.ikinciEl=true;
        arac1.marka="volvo";
        arac1.km= 50000;
        arac1.model="xc60";
        arac1.motorHacim=2.4;
        //                       volvo         xc60          50000      default=0          true               2*4
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yıl+" "+arac1.ikinciEl+" "+arac1.motorHacim);
   // task-> 2. bır aracın tum     field`larını atayarak print ediniz
        C02_Arac myCar=new C02_Arac();
        myCar.marka="honda";
        myCar.model="accort";
        myCar.km=11;
        myCar.motorHacim=2.0;
        myCar.vitesAuto=false;
        myCar.ikinciEl=false;
        myCar.yıl=2022;
        System.out.println(myCar.marka+" "+myCar.model+" "+myCar.km+" "+myCar.yıl+" "+myCar.ikinciEl+" "+myCar.motorHacim);
        System.out.println("myCar = " + myCar);
    }//maın disi

    @Override
    public String toString() {//tum obj field print edilir
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacim=" + motorHacim +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yıl=" + yıl +
                '}';
    }
}
