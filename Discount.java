/* 
    Learning OOP Concepts using Class, Object & Constructor
    1. Write a Java program to create a class Discount containing SalesAmount as data member.
    SalesAmount should be given as input using appropriate input( ) method/ constructor defined in
    the class.
    In the class, define 2 methods viz. compute1( ) and compute2( ), those will compute the discount
    to be given using if-else construct and ternary operator respectively, following the below mentioned
    conditions:
    o If SalesAmount is less than INR.10000/-, no discount given,
    o If SalesAmount is greater than INR.10000/- and less than INR.20000/-, 3% discount will be given,
    o If SalesAmount is greater than INR.20000/- and less than INR.40000/-, 5% discount will be given,
    o If SalesAmount is greater than INR.40000/- , 10% discount will be given.
     Add display( ) function to display the calculated discount.
        */
import java.util.*;
public class Discount{
    Scanner sc=new Scanner(System.in);
    private float discount,SalesAmount;
    private void input(){
        System.out.println("Enter sales amount: ");
        this.SalesAmount=sc.nextFloat();
    }
    private void compute1(){
        
        if(this.SalesAmount > 40000f)
            this.discount=.1f;
        else if (this.SalesAmount > 20000f)
            this.discount=.05f;
        else if (this.SalesAmount > 10000f)
            this.discount=.03f;
        else
            this.discount=0;
        this.discount=this.SalesAmount*this.discount;
    }
    private void compute2(){
        (this.SalesAmount > 40000f)?(this.discount=.1f):(this.SalesAmount > 20000f)?(this.discount=.05f):(this.SalesAmount > 10000f)?(this.discount=.03f):(this.discount=0);
    }
    private void display(){
        System.out.println("Discount: "+this.discount);
    }
    public static void main(String[] args) {
        Discount d1 =new Discount();
        d1.input();
        d1.compute1();
        d1.display();
        Discount d2 =new Discount();
        d2.input();
        d2.compute1();
        d2.display();
    }
}