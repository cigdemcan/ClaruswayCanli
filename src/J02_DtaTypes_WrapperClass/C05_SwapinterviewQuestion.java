package J02_DtaTypes_WrapperClass;

public class C05_SwapinterviewQuestion {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=34;
        //a)
        System.out.println("Swaptan önce sayı1 ->" +sayi1 + " + sayi2 ->" + sayi2);
        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("Swaptan sonra sayi1->" + sayi1+"+ sayi2 ->" +sayi2);

        //b)
        System.out.println("Swaptan önce sayi1 ->"+sayi1 + ","+ "sayi2-> "+sayi2 );
        sayi1=sayi1+sayi2;//sayı1=54
        sayi2=sayi1-sayi2;//sayı2=20
        sayi1=sayi1-sayi2;//sayı1=34
        System.out.println("Swaptan sonra sayı1->" +sayi1 +","+ "sayı2 -> "+sayi2);



    }
}
