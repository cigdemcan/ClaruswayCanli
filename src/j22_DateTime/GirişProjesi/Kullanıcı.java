package j22_DateTime.GirişProjesi;

import java.time.LocalDateTime;

public class Kullanıcı {


/*TASK - >
    Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak
    ekleyen ve sonrasında her dakikanın ilk 10 saniyesinde kaydolanları
    şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
            Bunun için;
1- Bir user(Kullanıcı) class oluşturun fields: name , registerDate(kayıtZamanı) (data type->LocalDateTime )
            2- Registration(Kayıt) isminde bir class oluşturun ve register()(kayıtAl()) isminde bir metod
    create ederek Kullanıcı Class'dan user ismini(name) alarak ArrayList e ekleyin ve bu list i
            return edin.
3- Registration(Kayıt) classı na aynı zamanda kendine verilen(parametre)
    ArrayListteki userlardan(kullanıcı obj) her dakikanın ilk 10  saniyesinde kaydolanları
    yazdıran printHappyUsers(sanslıKullanıcı) isminde bir metod create ediniz


    Obj ile uyglamayı run ediniz


    İpucu Çalışacak main metodu aşağıdaki gibi olmalıdır.

    public static void main(String[] args) {
        Kayıt yeniKayıt = new Kayıt();
        ArrayList<Kullanıcı> kisi = yeniKayıt.kayıtAl();
        yeniKayıt.sanslıKullanıcı(kişi);*/
    //Task 1 step
    String name;//kullanıcı obj ure
    LocalDateTime kayıtZamanı;//full parametreli cons.

    @Override
    public String toString() {//bu class dan olusturulan obj print etmek için obj datalarını string tipine çevirir
        return "Kullanıcı{" +
                "name='" + name + '\'' +
                ", kayıtZamanı=" + kayıtZamanı +
                '}';
    }

    public Kullanıcı(String name, LocalDateTime kayıtZamanı) {
        this.name = name;
        this.kayıtZamanı = kayıtZamanı;

    }
}

