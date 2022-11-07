package j26_Inheritance.task02;

public class SubClass extends SuperClass{
    public static void main(String[] args) {
       SubClass obj=new SubClass();
       obj.my_method();;
    }
    int num= 10;
    public  void my_method(){
        göster();//SubClass call
        super.göster();//SuperClass call
        System.out.println("subClass num:" +num);
        System.out.println("SuperClass num:" +super.num);
    }

    @Override
    public void göster() {
        System.out.println("Bu method Sub classsın görüntülenme methodudur. ");
    }
}
