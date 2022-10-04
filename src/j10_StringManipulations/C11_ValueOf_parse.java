package j10_StringManipulations;

public class C11_ValueOf_parse {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.
//task->string type verilen bağış miktarını toplayan code create ediniz
        String bağış1="1500";
        String bağış2="2500";
       int bağışDeğeri1= Integer.valueOf(bağış1);//bağıs1 string içindeki sayı değerini int`e çevirdi bagısDegeri1 e atadı
       int bağışDeğeri2= Integer.valueOf(bağış2);

        System.out.println("toplam bağıs miktarı"+(bağışDeğeri1+bağışDeğeri2));//bagıs degerleri yoplanıp perint edildi

        int fetih=Integer.valueOf("1453");
        System.out.println(fetih);//1453


        System.out.println("toplam bagıs:"+(Integer.parseInt(bağış1) + Integer.parseInt(bağış2)));//4000



        int tc=1234567;
        String strTc=String.valueOf(tc);
        System.out.println("strTc="+strTc);//1234567
        System.out.println("strTc+tc="+(strTc+tc));//12345671234567



    }
}
