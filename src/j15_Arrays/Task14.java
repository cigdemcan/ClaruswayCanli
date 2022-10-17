package j15_Arrays;

public class Task14 {
    public static void main(String[] args) {

        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        String yenistrArr[]=str.split("");
        int toplam=0;
        for (int i = 0; i <yenistrArr.length ; i++) {
            if (Character.isDigit(str.charAt(i))){
                toplam+=Integer.parseInt(yenistrArr[i]);
            }
        }
        System.out.println(toplam);
    }
}
