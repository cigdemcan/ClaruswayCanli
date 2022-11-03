package j25_Encapsulation.encapsulation03;

public class Runner {
    public static void main(String[] args) {
      //4.step
        Araç honda=new Araç("accord","siyah",-200,2012);
        Araç volvo=new Araç("s80","beyaz",2000,-2015);
        Araç haciMurat=new Araç();

        haciMurat.setModel("serçe");
        haciMurat.setMotor(1300);
        haciMurat.setYil(1974);
        haciMurat.setRenk("cücük sarı");
        System.out.println("honda = " + honda);
        System.out.println("haciMurat = " + haciMurat);
        System.out.println("volvo = " + volvo);
    }
}
