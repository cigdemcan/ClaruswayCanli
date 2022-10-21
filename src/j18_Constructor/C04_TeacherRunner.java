package j18_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {
        C04_Teacher ogrt1=new C04_Teacher();
        ogrt1.ad="muharrem";
        ogrt1.soyad="guzel";
        ogrt1.branş="Qa";
        ogrt1.emekli=false;
        ogrt1.maaş=23000;
        ogrt1.tecrube=11;
        ogrt1.dersSaati();
        System.out.println(ogrt1);

        C04_Teacher ogrt2=new C04_Teacher("ugur","javacan","dev",15,100000,333,false);
        System.out.println("ogrt2 = " + ogrt2);


    }
}
