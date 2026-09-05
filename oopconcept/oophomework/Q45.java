class car{
    String brand;
    String model;
    double price;
    void display(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);

    }    
}
public class Q45{
    public static void main (String args[]){
        car c1=new car();
        c1.brand="bmw";
        c1.model="x5";
        c1.price=5000000;
        car c2=new car();
        c2.brand="audi";
        c2.model="a6";
        c2.price=6000000;
        car c3=new car();
        c3.brand="mercedes";
        c3.model="s class";
        c3.price=7000000;
        c1.display();
        c2.display();
        c3.display();
    }
}