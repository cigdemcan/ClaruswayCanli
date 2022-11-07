package j26_Inheritance.task01;

public class Runner {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.mesaj);//"Agama A class `dan hörmetler :)"

        B b=new B();
        System.out.println(b.mesaj);//"static variable ınheritance `da ClassName olmadan call edilir"
    }
}
