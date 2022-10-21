package j18_Constructor;

public class C05_Arac {
    //Fields->obj`nın uretilirken alacağı  değer variables
    //bir class`da birden cok cons. tanımlanabilir

    int maxHız;
    String model;

    public C05_Arac(int maxHız){//1 p.li cons.call edildi
        this(180,"hacıMurat");
        this.maxHız = maxHız;
        System.out.println("1 parametreli cons coll edildi");

    }
    public C05_Arac(){//sefil parametresiz cons.

    }

    public  C05_Arac(int maxHız,String model){
        this.maxHız=maxHız;
        this.model=model;
        System.out.println("2 p`li cons. coll edilmiştir");
    }

    public  C05_Arac(String model,int maxHız){
        this.maxHız=maxHız;
        this.model=model;
        System.out.println("2 parametreli cons. call edilmiştir");
    }

}
