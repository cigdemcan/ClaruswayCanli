package j33_Interface;

public class Sahın extends Tofas implements içDonanım,dısDonanım,Lastik {//zavallı concereta child
    @Override
    public void ebat() {
        System.out.println("agam 16 inc lastik ebat");
        System.out.println("Dr bu ne insan yıyecek bunu");

    }

    @Override
    public void jant() {
        System.out.println("agam senın gibi janti adama celik ince yanak yakısır");

    }

    @Override
    public void motor() {
        System.out.println("agam 1.6 aile motor");

    }

    @Override
    public void yakıt() {
        System.out.println("agam tup tak yoksa ocagına incir agacı");

    }

    @Override
    public void kapı() {
        System.out.println("agam 4 kapı");

    }

    @Override
    public void kaporta() {
        System.out.println("agam akordion kporta gamzesiz olmaz");


    }

    @Override
    public void koltuk() {
        System.out.println("agam yılan derisi koltuk");

    }

    @Override
    public void klıma() {
        System.out.println("agam klıma sart");

    }
}
