import java.util.Scanner;

class Student{
    double mark1,mark2,mark3;
    Student(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    void total(){
        double total=mark1+mark2+mark3;
        System.out.println("total marks is "+total);

    }
    void average(){
        double average=(mark1+mark2+mark3)/3;
        System.out.println("average marks is "+average);
    }
}
public class Q46{
    public static void main (String args[]){
       
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the first mark");
       double mark1=sc.nextDouble();
       System.out.println("enter the second mark");
       double mark2=sc.nextDouble();
       System.out.println("enter the third mark");
       double mark3=sc.nextDouble();
       Student s=new Student(mark1, mark2, mark3);
       
       s.total();
       s.average();
    }
}