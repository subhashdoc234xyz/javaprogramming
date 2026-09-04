class student {

    String name;
    int age;

    // Constructor
    student(String a, int b) {
        this.name = a;
        this.age = b;
    }

    // Method
    void display() {
        System.out.println("Name: " + this.name);//System.out.println("Name: " + name);
        System.out.println("Age: " + this.age);//System.out.println("Age: " + age);
    }
}

public class Oopsth {

    public static void main(String[] args) {

        student s1 = new student("John", 20);

        s1.display();
    }
}