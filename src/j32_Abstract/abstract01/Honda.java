package j32_Abstract.abstract01;

public abstract class Honda {//parent abstract class
    public abstract void  motor();

    void sunrooff() {
        System.out.println("agam keyfini bilirden ama subroof exstra ucret :)");
    }
//abs class da variable tanımlanbilir mi ->evet
    String name="çağla team lead";
    //Variable `lar abtractlar tanımlanır mı? ->kesinlikle hayır
   // public  abstract  int yas=37;//->olamaz


    abstract void koltuk();
    abstract void kapı();
   // final void  finalMethod();//concrete method bodsiz olamaz
   // final abstract void   finalMethod();//abs method final olamaz

   // private void privateMethod();//concrete method badsiz olamaz
   // private abstract void privateMethod();//abs method private olamaz

   // static  void güneşMethod();///concrete method badsiz olamaz
   // static abstract void güneşMethod();//abs method static olamaz

   // Honda obj=new Honda() {//melekler dogurmaz abs class obj uretmez




    }



