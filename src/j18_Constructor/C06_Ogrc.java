package j18_Constructor;

public class C06_Ogrc {
    //Fields
    String isim="Merve Hanım";
    int yas;
    String name;
    int age;

    public  C06_Ogrc(String isim, int yas){
      //  this.isim=isim;
      //  this.yas=yas;
        name=isim;
        age=yas;
        System.out.println("cons`daki isim:"+isim);
        System.out.println("cons`daki isim:"+this.isim);
        System.out.println("cons`daki isim:"+name);
    }
}
