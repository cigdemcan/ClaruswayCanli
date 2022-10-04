package J02_DtaTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {

        String ad =" Çağla";
        String soyad ="Cengiz";

        int a=7;
        int b=11;
// birden fazla String varible ile farklı data type variableler + ile işleme alınırsa
    //    java birleştirme yaparak yeni bir Strig oluşturur

        System.out.println(ad+soyad+a+b );//
        System.out.println(a+ad+soyad+b );//
        System.out.println(a+b+ad+soyad );//
        System.out.println( " "+a+b );//
        System.out.println(ad+(a-b)+(a-b)) ;//

        char ch='1';//
        System.out.println(ad+ch);
        System.out.println(a+ch+ad);
        System.out.println(ad+(ch+b));
        System.out.println(a+ad+ch);

        /*TRICK-> char data turu işleme girdiği variablesin turune göre farklı işlem yapar
        eğer işleme girdiği variables aritmetik birm işlemse aşcii değeri ile işlem yapar->
         */
    }
}
