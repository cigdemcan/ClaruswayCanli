package j10_StringManipulations;

public class C04_Contains {
    public static void main(String[] args) {
      /*String içerisinde istenen stringin varlığını kontrol eder boolean return eder..  */

     String s1="Enise hanım başarılı bir Qa tester team lead" ;
        System.out.println(s1.contains("hanım"));
        System.out.println(s1.contains("E"));
        System.out.println(s1.contains(" "));

        String s2="Qa";
        System.out.println(s1.contains(s2));//true
        System.out.println(s2.contains(s1));//false
        //task->girilen bir cümlede aranan kelimenin varlığını kontrol eden code creata ediniz-ternary kullanınız





    }
}
