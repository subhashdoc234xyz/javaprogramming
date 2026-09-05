class student{
    int id;
    String name;
    int age;
    student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
    }
}
public class Q41{
    public static void main (String args[]){
        student s=new student(1001,"alex",20);
      
        s.display();

    }
}