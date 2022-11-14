package j32_Abstract.abstract01;

public class Civic extends Lastik {//Honda parent abs Class extend child concrete class
    /*
    extend Honda yazılarak Honda Classa concrete bir Civic class tanımlandı java CTE verdi
    ÇÖZÜM :a)Unımplemented(uyarlanmamış )method implement edilmeli
    b)parent Hond classdan abstarct keyword kaldırılmalı
    c)concrete olan chid Civic class abstract tanımlanmalı

     */
    //concrete class da abstract method tanımlanır mı?
   // public abstract void absMethod();//ya class abs olmalı ya da method concrete bady olmalı
    //TRİCK->child concrete class parent abs classın abs methodlarını mutlaka implement etmeli

    @Override
    public void motor() {
        System.out.println("Agam 1.6 eco motor az yakar cok kaçar");
    }

    @Override
    void koltuk() {
        System.out.println("Agam ucuz olsun diye kumaş koltuk temiz kullanın");

    }

    @Override
    void kapı() {
        System.out.println("5 kapı sedan");

    }public  int vites(){//concerete child class method
        return 5;
    }


    @Override
    public void lastikEbat() {
        System.out.println("21 inç lastik");

    }
}
