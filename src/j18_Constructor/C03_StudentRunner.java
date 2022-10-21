package j18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {
        C03_Student ogrc1=new C03_Student();
        ogrc1.ad="fatih";
        ogrc1.soyad="Ataş";
        ogrc1.sınıf=1;
        ogrc1.okulNo=11001;
        ogrc1.ortalama=77;
        ogrc1.takdir=false;
        ogrc1.sosyalFaaliyet();
        System.out.println("ogrc1 = " + ogrc1);

        ogrc1.mezuniyet();//
        //task-> diğer bir ogrc obj ile tum fields leri prınt edınız
        C03_Student ogrc2=new C03_Student();

        ogrc1.ad="hakan";
        ogrc1.soyad="can";
        ogrc1.sınıf=8;
        ogrc1.okulNo=18;
        ogrc1.ortalama=98;
        ogrc1.takdir=true;
        System.out.println("ogrc2 = " + ogrc2);
    }
}
