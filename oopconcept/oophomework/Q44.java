import java.util.Scanner;
class Bankaccount{
    int accoutno;
    String holdername;
    double balance;
    Bankaccount(int accoutno,String holdername,double balance){
        this.accoutno=accoutno;
        this.holdername=holdername;
        this.balance=balance;

    }
    void display(){
        System.out.println(accoutno);
        System.out.println(holdername);
        System.out.println(balance);
    }
}
public class Q44{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the account number");
        int accoutno=sc.nextInt();
        System.out.println("enter the holder name ");
        String holdername=sc.next();
        System.out.println("enter the balance ammount in the account ");
        double balance=sc.nextDouble();
        Bankaccount b=new Bankaccount(accoutno,holdername,balance);
        b.display();
    }
}