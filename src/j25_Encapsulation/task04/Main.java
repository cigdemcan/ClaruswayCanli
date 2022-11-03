package j25_Encapsulation.task04;

import java.util.Scanner;

public class Main {//Main ->Anaclass


   /*
    Burada iki adet class vardır. Biri Main, diğeri ise student ,
    student classı içinde;
    String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz.

    Main classın içinde;
    girilen değerleri aşagıdaki gibi print eden code create ediniz
    Örnek:
    age 12'dir.
    name Steven'dır.

    name(isim) olarak;
    "Student name is Steven"
    ve
    age(yaş) olarak da;
    "He is 12 years old"


 */
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("agam adını giresen");
            String ad=sc.nextLine();
            System.out.println("agam yasını giresen");
            int yas=sc.nextInt();
            Student s1=new Student(ad,yas);
            System.out.println("student name is :"+s1.getName()+"\nHe is"+ s1.getAge()+"years old" );




    }//main sonu
}//class sonu

class Student{//student class ->inner class
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

