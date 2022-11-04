package j26_Inheritance.Inheritance02;

public class Mammal extends Hayvancık {//Hayvancık parentin child class- baba
    public Mammal() {// p siz cons.
        this('Y');
        System.out.println("Agam ahan da Mammal p`siz cons.");
    }
    public Mammal(char c){//p`li cons.
        super(17);
        System.out.println("Agam ahan da Mammal p`li cons.");
    }
   public  void mC(){//ezilen method
       System.out.println("mC ->  Mammal class method call");
   }
    int m=1;
    int c=4;

    @Override
    public void mM() {// parentten ezen method
        System.out.println("mM ->  Mammal class method call");
    }
}//class sonu
