package j26_Inheritance.Inheritance02;

import j26_Inheritance.Inheritance01.Koyun;
import j26_Inheritance.Inheritance01.Paluk;

public class Runner {
    public static void main(String[] args) {
        //data type objName    cons.

        Kedi       k1=         new Kedi();
        System.out.println("k1.a =" + k1.a);//0->Hayvancık class call
        System.out.println("k1.c =" + k1.c);//2->Kedi class call
        System.out.println("k1.d =" + k1.d);//5->Kedi class call
        System.out.println("k1.m =" + k1.m);//1->Mammal Class call

        k1.mA();//Hayvancık class call
        k1.mC();//kedi class call
        k1.mM();//Mamal class call
/*
 Method cagirilirken ayni isimli methodlardan
 hangisinin kullanilacagina Constructor karar verir.
 Methodlari arastirmaya Consctuctor ismini tasiyan
 class'dan baslayin ve parentlarda arastirmaya devam edin.
 */

/*
  Ayni isimli variable'lardan hangisinin kullanildi
olusturulan object'in data type'ina göre bilinir
Variable'i arastirmaya data type'i classindan baslanır.
*/
        Mammal k2 =new Kedi("Kevser Hanım");//DataType parent class cons ->p`li
        System.out.println(k2.c);//4
        System.out.println(k2.a);//0
        System.out.println(k2.m);//1
       // System.out.println(k2.d); CTE k2 data type Mamal Class variable yokcall edilemez
        k2.mA();//hayvancık class call
        k2.mC();//kedi class call
        k2.mM();//mamal class call

        Hayvancık k3=new Kedi();
        System.out.println(k3.m);//3
        System.out.println(k3.a);//0
        //k3.c-> datatype hayvancık class old için variable call edilemez
        k3.mA();
        k3.mM();

        Mammal m1=new Mammal('$');
        System.out.println(m1.m);//1
        System.out.println(m1.a);//0
        System.out.println(m1.c);//4
       // m1.d-> parent Mamal Class Child Kedi Class`dan variable call edilemez
        m1.mA();//Hayvancık class call
        m1.mC();  //Mamal class call

        m1.mM(); //Mamal class call
    }
}
