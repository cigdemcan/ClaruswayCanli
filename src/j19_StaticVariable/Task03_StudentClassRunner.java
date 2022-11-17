package j19_StaticVariable;

public class Task03_StudentClassRunner {
    public static void main(String[] args) {
   Task03_StudentClass mat101= new Task03_StudentClass();
   mat101.name="matematik";
    mat101.maxCredit=3;

        Task03_StudentClass fizik= new Task03_StudentClass();
        fizik.name="matematik";
        fizik.maxCredit=3;

        Task03_StudentClass resim= new Task03_StudentClass();
        resim.name="matematik";
        resim.maxCredit=3;

Task03_LessonClass ders=new Task03_LessonClass(mat101.name,3);
       int ders1= ders.credit;
        System.out.println(ders1);
    }
}