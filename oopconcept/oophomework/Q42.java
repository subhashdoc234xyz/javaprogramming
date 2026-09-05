class Employee{
    int id;
    String name;
    int age;
    Employee(int id,String name,int age){
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
public class Q42{
    public static void main (String args[]){
        Employee e=new Employee(10001,"beshop",35);
        e.display();
    }
}