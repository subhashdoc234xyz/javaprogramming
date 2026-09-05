class Rectangle{
    int length;
    int breadth;
    int area(){
        return length*breadth;
    }
}
public class Q43{
    public static void main (String args[]){
        Rectangle rect=new Rectangle();
        rect.length=10;
        rect.breadth=200;
        
        System.out.println("are of the rectangle:"+rect.area());
    }
}