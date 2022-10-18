package day08;

public class Q04_Arrays {
    public static void main(String[] args) {
        /*

        * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenentoplam=9;
        toplamDokuz(arr,istenentoplam);
    }
    private static void toplamDokuz(int[] arr, int istenentoplam) {
        for (int i = 0; i <arr.length ; i++) {//outer loop 1. toplanan
            for (int j = i; j < arr.length; j++) {//inner loop 2. toplanan
                if(arr[i]+arr[j]==istenentoplam){
                    System.out.println(arr[i] + "ve"+ arr[j]+ "toplamı:" + istenentoplam);
                }

            }

        }
    }
}
//inner loop j=i+1 ve j=i olurrsa
/*      5ve4toplamı:9
        7ve2toplamı:9
        -6ve15toplamı:9
        8ve1toplamı:9*/
