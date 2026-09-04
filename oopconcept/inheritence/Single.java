class father{
    String name;
    int age;
    father(String name,int age){
        this.name=name;
        this.age=age;
       }
    void house(){
        System.out.println("2bhk house");
        System.out.println("Father name is: "+name);
        System.out.println("Father age is: "+age);
    }
}
class son extends father{
    String name;
    int age;
    son(String name,int age,String name1,int age1){
        super(name1,age1);
        this.name=name;
        this.age=age;
    }
    void car(){
        System.out.println("BMW");
        System.out.println("Son name is: "+name);
        System.out.println("Son age is: "+age);
    }
}
public class Single{
    public static void main(String[] args){
    son s=new son("Alex",20,"Raj",35);
    s.car();
    s.house();
}
}