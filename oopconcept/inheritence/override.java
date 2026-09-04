class father{
    void land(){
        System.out.println("5bhk");
    }
}
class son extends father{
    @Override
    void land(){
        System.out.println("3bhk");
    }
}
public class override{
    public static void main (String args[]){
        son s=new son();
        s.land();
    }
}