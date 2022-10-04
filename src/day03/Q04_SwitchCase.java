package day03;

import java.util.Scanner;

public class Q04_SwitchCase {
    public static void main(String[] args) {
        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
        String day="Wednesday";
        switch (day){
            case"Mandat":
            case"Tuesday":
                System.out.println("java class");
                break;
            case"Thursday":
            case"friday":
                System.out.println("Selenium class");
                break;
            case"Wednasday ":
            case"Saturday":
                System.out.println("Sql class");
                break;
            default:
                System.out.println("izin günü");

        }








    }
}
