class calculator{
    void add (int a,int b){
       System.out.println(a+b);
    }
    void add (double a,double b){
        System.out.println(a+b);
    }
}
public class overload{
    public static void main (String args[]){
        calculator c=new calculator();
        c.add(10,20);
        c.add(10.5,20.5);

    }
}