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
        System.out.println("ogrc1 = " + ogrc1);

        ogrc1.mezuniyet();//
        //task-> diğer bir ogrc obj ile tum fields leri prınt edınız
    }
}
