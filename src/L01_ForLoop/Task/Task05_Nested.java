package L01_ForLoop.Task;

public class Task05_Nested {
    public static void main(String[] args) {
        /*
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        sekli print eden code create ediniz
         */

        for(int apt=1; apt<=6; apt++) {
            for (int daire = 1; daire < 6; daire++) {
                System.out.print("# ");
            }
            System.out.println();//dumy->hayalet komut.işlevi olmayan satır atlatan


        }

    }
}