class product{
    String name;
    double price;
    product(String name,double price){
        this.name=name;
        this.price=price;
    }
    void display(){
        System.out.println("product name "+name);
        System.out.println("product price"+price);
    }
}
public class Q47{
    public static void main (String args[]){
        product p1=new product ("laptop",50000);
        product p2=new product("mobile",20000);
        product p3=new product ("headphone",2000);
        p1.display();
        p2.display();
        p3.display();
        product moreexpense=p1;
        if(p2.price>moreexpense.price){
            moreexpense=p2;
        }
        if (p3.price>moreexpense.price){
            moreexpense=p3;

        }
        System.out.println("more expensive product is "+moreexpense.name);
        System.out.println("more expensive product price is "+moreexpense.price);
    }
}