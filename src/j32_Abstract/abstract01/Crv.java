package j32_Abstract.abstract01;

public class Crv extends Honda {
    @Override
    public void motor() {
        System.out.println("agam 2.4 super turbo motor arazi seni bekler");
    }

    @Override
    void koltuk() {
        System.out.println("agam deri koltuk arazide daha ");

    }

    @Override
    void kapı() {
        System.out.println("agam kapılar vakumlu carpılmayasın");

    }
    Honda obj=new Civic();//honda oğlu civic
    Civic obj1=new Civic();//civic oglu cıvıc
}
