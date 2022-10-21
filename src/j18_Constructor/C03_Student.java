package j18_Constructor;

public class C03_Student {//maın olmayan sadece student obj create etmek için pojo->plan old object
    //fields->
    String ad;
    String soyad;
    int sınıf;
    double ortalama;
    int okulNo;
    boolean takdir;

    public void mezuniyet() {
        if (ortalama >= 50) {
            System.out.println("agam diploman hayırlı olsun");
        }else System.out.println("agam seneye de bekleriz");
    }
    public void sosyalFaaliyet(){
        System.out.println("agam fiziksel zındelik=koş babam koş");
    }

    @Override
    public String toString() {//obj referans değeri
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';


    }
}