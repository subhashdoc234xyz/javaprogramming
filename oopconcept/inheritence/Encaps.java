
class student{

    private String name;

    private int age;

    public void  setname(String Name){

        this.name=Name;

    }

    public void setage(int Age){

        this.age=Age;

    }

    String getname(){

        return name;

    }

    int getage(){

        return age;

    }

}

public class Encaps{

    public static void main(String args[]){

        student s=new student();

        s.setname("xenon");

        s.setage(15);

        System.out.println(s.getname());

        System.out.println(s.getage());

    }

}