package L01_ForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
      /*eger bır dongunun badysinde baska bir dongu bulunuyorsa bu tur dongulere nested-loop->içiçe dongu denır
        iç dongu diş dongunun her adımında tekrar çalışır
        içiçe dongulerde en içteki döngu en önce çalışır
       */
      for (int apt = 0; apt <= 10; apt++) {//dış dongu
            System.out.println("dış dongu: " + apt);
            for (int daire = 1; daire < 6; daire++) {//iç dongu
                System.out.println("apt" + apt + "için daire dongu :" + daire);
            }
        }



    }
}