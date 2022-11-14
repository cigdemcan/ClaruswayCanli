package j32_Abstract.abstract01;

public class Accord extends Honda{
    @Override
    public void motor() {//implement edilen abs method
        System.out.println("agam 2.0 turbo atsle hız felakettir");

    }

    @Override
    void koltuk() {//implement edilen abs method
        System.out.println("agam deri koltuk ter yapar ");

    }

    @Override
    void kapı() {//implement edilen abs method
        System.out.println("agam vakumlu kapı carpılmayasan");

    }

    @Override
    void sunrooff() {//override  edilen abs method
        System.out.println("agam sigara yakınca sunrof acmayasın");
    }
}
