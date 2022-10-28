package j22_DateTime.GirişProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Kayıt yeniKayıt=new Kayıt();//kayıt Class`a erişim için p`siz cons. ile yeniKayıt obj uretildi
        //Kayıt Class`dan obj olmadan
        List<Kullanıcı>kişi=new ArrayList<>();
        boolean çıkılsınMı=true;
        while (çıkılsınMı){
            System.out.println("agam ne istersin\n1 ->Kullanıcı kayıt Al\n ->2 şanslı kişi bul\n3Listele");
            int tercih=sc.nextInt();
            switch (tercih){
                case 1 :
                kişi= yeniKayıt.kayıtAl();//kayıt Classtan yeni kayıt obj kayıtAl() method call edildi
                    break;
                case 2 :
                    yeniKayıt.sanslıKullanıcı(kişi);

                    break;
                case 3:
                    yeniKayıt.listele(kişi);

                    break;
                case 4 :
                  çıkılsınMı =false;

                    break;
            }
        }
    }
}
