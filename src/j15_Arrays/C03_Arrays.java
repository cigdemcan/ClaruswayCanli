package j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        //String data array`a çevirme..split()->girilen parametre değere gore String ifade parçalanır
        String str = "javaCAN`lara slm olsun. en kısa zamanda bolcana offer sonrası TUZLABALIK :)";
        //task->string ifadeyi kelime sayısını print eden code create ediniz
        String strArr[] = str.split(" ");//str her " " kraktere göre parçalanır.her bır parca str arrayın bir elemanı olarak atandı
        System.out.println(Arrays.toString(strArr));//
        System.out.println(strArr.length);//11
        //task->string ifadedeki harf sayısını print eden code create ediniz
        String harfArr[] = str.split("");//string harf harf ""hiçliğe göre parçalandı
        System.out.println(Arrays.toString(harfArr));
        System.out.println(harfArr.length);//77
    }
}
