package J02_DtaTypes_WrapperClass;

public class C04_WrapperClass {

    public static void main(String[] args) {
        String name="Haluk";
        int yas=33;

       System.out.println( name.toUpperCase());
       //TASK id ile tc değerlerinin toplamını print eden code yazınız
        String tc= "1234455";
        String id="98765";
        System.out.println(tc+id);//concat->birleştirme:123445598765

        int yeniTC=Integer.valueOf(tc);// tc String değerini int çevirdi ve yeniTC atadı
        int yeniId=Integer.valueOf(id);//id String değerini int çevirdi  ve yeniId atadı
        System.out.println(yeniId+yeniTC);// aritmetik toplama yapar-

        //TASK->byte short int maximum ve minimum değerlerini print eden code yazınız
        byte maxByteDeğeri=Byte.MAX_VALUE;
        byte minByteDeğeri=Byte.MIN_VALUE;
        System.out.println("maxByteDeğeri="+ maxByteDeğeri);
        System.out.println("minByteDeğeri="+ minByteDeğeri);


        System.out.println(" Integer.MAX_VALUE");
        System.out.println(" Integer.MIN_VALUE");
    }
}
