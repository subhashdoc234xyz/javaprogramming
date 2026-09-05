import java.util.Scanner;
class Rectangle{
    int length;
    int breadth;
    void area(){
        System.out.println("Area of rectangle is: "+(length*breadth));
    }
}
public class Q43v2{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the rectangle");
        int length=sc.nextInt();
        System.out.println("enter the breadth of the rectangle");
        int breadth=sc.nextInt();
        Rectangle rect=new Rectangle();
        rect.length=length;
        rect.breadth=breadth;
        rect.area();
    }
}