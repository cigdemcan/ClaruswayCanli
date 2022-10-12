package J14_Scope;

public class C01_InstanceVariable {   /*                                  INSTANCE VARIABLE

   1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
      olusturulan variable'lara "instance variable" denir.
   2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
   3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
      Asagida goruldugu gibi "yas" variable'ina deger atamasi yaptim "tecrube" variable'ina yapmadim.
      Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
         "yas    /*                                  INSTANCE VARIABLE

   1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
      olusturulan variable'lara "instance variable" denir.
   2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
   3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
      Asagida goruldugu gibi "yas" variable'ina deger atamasi yaptim "tecrube" variable'ina yapmadim.
      Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
         "yas" variable'i initialize edildi, digerleri initialize edilmedi.
   4) Initialize edilmeyen "instance variable" lar icin Java kendisi deger atamasi yapar.
      Java'nin instance variable'lara kendisinin verdigi degerlere "default value" denir.
            byte, short, int, long icin default value 0'dir.
            float, double icin default value 0.0'dir.
            char icin default value 0'dir.
            boolean icin default value false'dur.
            String icin default value "null" dir.

*/
//instance obj var
    int yas = 48; //initialized ilk atamsı yapılmış ins. variable
    int tecrube;// default deger 0
    String name;// default deger null
    boolean developerMı;// deafult deger false
    double boy;// default deger 0.0
    char unvan;// default deger bosluk

    public static void main(String[] args) {//main bası
//obj creatıon->ClasnameobjName=new ClasName();
        C01_InstanceVariable ebikGabıkObj=new C01_InstanceVariable();
        ebikGabıkObj.boy=1.9;
        ebikGabıkObj.developerMı=true;
        ebikGabıkObj.name="kubra hanım";
        System.out.println(ebikGabıkObj.name);//kubra hanım
        System.out.println(ebikGabıkObj.tecrube);


    }//main sonu

    public static void staticMethod() {
    }

    public void non_staticMethod(){
        System.out.println("static olmayan methoddan agama slm");
    }
    public static void statıcMethod(){
        System.out.println("statıc guneş methoddasın agam devamke");
    }
}

