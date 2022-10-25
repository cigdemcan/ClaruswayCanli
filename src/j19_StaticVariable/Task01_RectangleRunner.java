package j19_StaticVariable;

public class Task01_RectangleRunner {
    public static void main(String[] args) {

        Task01_Rectangle rectangle=new Task01_Rectangle(10,15);
        System.out.println("rectangleCevre = " + rectangle.cevre());

        Task01_Rectangle rectangle1=new Task01_Rectangle(10,15);
        System.out.println("rectangleAlan = " + rectangle.alan());
    }

}
