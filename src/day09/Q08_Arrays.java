package day09;

public class Q08_Arrays {
    public static void main(String[] args) {

        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */


        String [][] arr = {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam =0;
        for (int i = 0; i < 3; i++) { //outer for
            for (int j = 0; j < 3; j++) { //inner for
                if(arr[i][j].contains("$")){ //$ isareti iceriyorsa
                    toplam+=Double.parseDouble(arr[i][j].replace("$",""))*3.2;
                    //parantez icindeki replaceAll methodu ile $ isaretlerinden kurtulduk, sonra elimizde "12" var(data type :String)
                    //Double toplam variable ile isleme katmak icin data casting yapmak gerekir, bu yuzden Double.parseDouble() methodunu kullandik
                    //bu asamada 12 degeri -> data type :Double oldu, eklerken de 3.2 ile carpmamizi istedigi icin carptik
                }else{
                    toplam+=Double.parseDouble(arr[i][j].replace("€",""))*4.2;
                }
            }

        }
        System.out.println("toplam = " + toplam); //374.6
    }
}
