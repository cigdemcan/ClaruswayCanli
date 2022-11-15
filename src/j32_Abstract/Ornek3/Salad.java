package j32_Abstract.Ornek3;

public abstract class Salad extends Food {
    public abstract void madeIn();//parent ve child abs. classlarda aynı isimle iki method alabilir

    @Override
    public void taste() {
        System.out.println("agam salatan gavurdagı coban söğüş mü verelim");
    }
}
