package j17_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        //task array elemanlarının carpımını prınt eden code create edniz
        int arr[][] = {{2, 3}, {4}, {5, 6, 7}};
        int carpım = 1;
        for (int[]kc : arr) {
            for (int a:kc){
                carpım*=a;
            }
        }
        System.out.println("carpım = " + carpım);
    }
}