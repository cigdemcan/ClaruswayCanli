package j22_DateTime.GirişProjesi;

import java.util.ArrayList;
import java.util.Scanner;

public class GirişPaneli {
    public static void giriş(){
    Scanner sc=new Scanner(System.in);
    Kayıt yeniKayıt=new Kayıt();//kayıt Class`a erişim için p`siz cons. ile yeniKayıt obj uretildi
    //Kayıt Class`dan obj olmadan method call etmek için methodlar static yapılırsa Classname ile call edilebilr
    ArrayList<Kullanıcı> kişi=new ArrayList<>();//kullanıcı clasdan uretilen obj lerin tutulacagı boş list
    boolean çıkılsınMı=true;
    while (çıkılsınMı){
        System.out.println("agam ne istersin\n1 ->Kullanıcı kayıt Al\n ->2 şanslı kişi bul\n3Listele\n4->Cıkış\n agam ne istersen secermisin");
        int tercih=sc.nextInt();
        switch (tercih){
            case 1 :
                kişi= yeniKayıt.kayıtAl();//kayıt Classtan yeni kayıt obj kayıtAl() method call edildi
                break;
            case 2 :
                yeniKayıt.sanslıKullanıcı( kişi);

                break;
            case 3:
                yeniKayıt.listele(kişi);

                break;
            case 4 :
                çıkılsınMı =false;

                break;
            default:
                System.out.println("agam adam gibi birseyler gir");
                break;
        }
    }
}

}