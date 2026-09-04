
class student{
    String name;
    int age;
student (String a, int b){
        name = a;
        age = b;
    }
void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}


public class Oops{
    public static void main(String[] args){
        student s1 = new student("John", 20);
        s1.display();
    }
}