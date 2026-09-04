package oopconcept;
class student {

    String name = "John";
    int age = 20;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Oopsda {

    public static void main(String[] args) {

        student s1 = new student();

        s1.display();
    }
}